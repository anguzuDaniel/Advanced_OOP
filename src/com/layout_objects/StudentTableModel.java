package com.layout_objects;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StudentTableModel extends AbstractTableModel {

    private List<Student> student;
    private String[] colNames = {"ID", "First Name", "Last Name", "Password", "Gender"};

    // accepts a list of students in constructor
    public StudentTableModel() {

    }

    /**
     * Returns a default name for the column using spreadsheet conventions:
     * A, B, C, ... Z, AA, AB, etc.  If <code>column</code> cannot be found,
     * returns an empty string.
     *
     * @param column the column being queried
     * @return a string containing the default name of <code>column</code>
     */
    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(List<Student> student) {
        this.student = student;
    }

    /**
     * Returns the number of rows in the model. A
     * <code>JTable</code> uses this method to determine how many rows it
     * should display.  This method should be quick, as it
     * is called frequently during rendering.
     *
     * @return the number of rows in the model
     * @see #getColumnCount
     */
    @Override
    public int getRowCount() {
        return student.size();
    }

    /**
     * Returns the number of columns in the model. A
     * <code>JTable</code> uses this method to determine how many columns it
     * should create and display by default.
     *
     * @return the number of columns in the model
     * @see #getRowCount
     */
    @Override
    public int getColumnCount() {
        return 5;
    }

    /**
     * Returns the value for the cell at <code>columnIndex</code> and
     * <code>rowIndex</code>.
     *
     * @param rowIndex    the row whose value is to be queried
     * @param columnIndex the column whose value is to be queried
     * @return the value Object at the specified cell
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = student.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getFirstName();
            case 2:
                return s.getLastName();
            case 3:
                return s.getPassword();
            case 4:
                return s.getGender();
        }
        return null;
    }
}
