package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class App {

    private Form form = new Form();

    private TablePanel tablePanel = new TablePanel();
    Database db = new Database();

    public App() {
        this.prepareLayout();
        this.dbConnect();
    }

    public final void dbConnect() {
        try {
            db.connect();
        }catch (Exception e) {
            e.printStackTrace();
        }

        db.addStudent(new Student("Anguzu", "Daniel", "1234",  Gender.male));
        db.addStudent(new Student("Anzo", "Benjamin", "5678", Gender.male));
        db.addStudent(new Student("Nayebare", "Brighton", "9178", Gender.male));
        db.addStudent(new Student("Adamu", "Ibrahim", "9175", Gender.male));
        db.addStudent(new Student("Chikala", "Olole", "1434",  Gender.male));
        db.addStudent(new Student("Krystal", "Byaruhanga", "5674", Gender.female));
        db.addStudent(new Student("Franco", "Enock", "9478", Gender.male));
        db.addStudent(new Student("Nsubuga", "Jonathan", "9185", Gender.male));

        try {
            db.save();
        }catch (Exception e) {
            e.printStackTrace();
        }

        // loads students from the database
        try {
            db.loadStudent();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        db.disconnect();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame registerForm = new JFrame("Registration Form");
        JPanel formPanel = new JPanel();

        TablePanel table = new TablePanel();

        table.setData(db.getStudents());

        GridLayout gridLayout = new GridLayout(0, 2);

        registerForm.setLayout(gridLayout);


        formPanel.setBorder(BorderFactory.createEtchedBorder());
        formPanel.setLayout(null);
        formPanel.add(form.prepareForm());

        registerForm.add(formPanel);
        registerForm.add(table);

        registerForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        registerForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        registerForm.setVisible(true);
    }
}
