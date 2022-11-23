package com.layout_objects;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Database {
    private final LinkedList<Student> students;
    private Connection conn;

    public Database() {
        students = new LinkedList<>();
    }

    // will help us connect to the database
    public void connect() throws Exception {
        if (conn != null) return;

        try {
            // step 1
            // Dynamically loads the class that will use to connect to the database
            // calls the com.mysql.cj.jdbc.Driver
            // this will be used to create a new instance of the called class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
        } catch (ClassNotFoundException e) {
            // handle the error
            throw new Exception("Driver not found");
        }

        // step 2
        // create a connection to our localhost
        String url = "jdbc:mysql://localhost:3306/student_registration";

        // step 3
        // get the connection
        // database user and password required to get a connection
        conn = DriverManager.getConnection(url, "root", "password");

        System.out.println("Connected: " + conn);
    }

    // will help us disconnect from the database
    public void disconnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("VendorError: " + e.getErrorCode());
            }
        }
    }

    // saves a student to the database
    public final void save() throws SQLException {

        String stmtSQL = "SELECT count(*) as count from student where id = ?";
        PreparedStatement stmtCheck = conn.prepareStatement(stmtSQL);

        // statement will insert student into our database
        String insertSql = "INSERT INTO student " +
                "(id, first_name, last_name, password, gender) " +
                "VALUES (?, ?, ?, ?, ?) ";

        // step 1
        // prepare the sql statement before execution
        PreparedStatement stmtInsertSql = conn.prepareStatement(insertSql);

        // step 2
        // loops through all uses in the table
        for (Student student : students) {
            int id = student.getId();
            String firstName = student.getFirstName();
            String lastName = student.getLastName();
            String password = student.getPassword();
            Gender gender = student.getGender();

            stmtCheck.setInt(1, id);

            // step 2
            // get the result of the executed sql statement
            ResultSet result = stmtCheck.executeQuery();
            result.next();

            int count = result.getInt(1);

            // if student doesn't exit add student
            // else we update student
            if (count == 0) {
                System.out.println("Inserting student with ID: " + id);

                // step 3
                // binds the parameters to the values
                int col = 1;
                stmtInsertSql.setInt(col++, id);
                stmtInsertSql.setString(col++, firstName);
                stmtInsertSql.setString(col++, lastName);
                stmtInsertSql.setString(col++, password);
                stmtInsertSql.setString(col++, gender.name());

                // step 4
                // executing the insert statement
                stmtInsertSql.executeUpdate();
            } else {
                System.out.println("Updating student with ID:" + id);
            }
            System.out.println("Count for person with ID: " + id + " is " + count);
        }

        stmtInsertSql.close();
        stmtCheck.close();
    }

    public void loadStudent() throws SQLException {
        students.clear();

        String sql = "SELECT * FROM student ORDER BY first_name ";
        Statement selectStmt = conn.createStatement();

        ResultSet results = selectStmt.executeQuery(sql);

        while (results.next()) {
            int id = results.getInt("id");
            String firstName = results.getString("first_name");
            String lastName = results.getString("last_name");
            String password = results.getString("password");
            String gender = results.getString("gender");

            Student student = new Student(id, firstName, lastName, password, Gender.valueOf(gender));
            students.add(student);
        }

        results.close();
        selectStmt.close();
    }

    // add a new student when it is called
    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    // remove student and index i
    public void removeStudent(int i) {
        students.remove(i);
    }
}
