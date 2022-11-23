package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TablePanel extends JTable {
    private JTable table;
    private StudentTableModel tableModel;

    public TablePanel() {
        tableModel = new StudentTableModel();
        table = new JTable(tableModel);

        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
        table.setFillsViewportHeight(true);
    }

    public void setData(List<Student> student) {
        tableModel.setData(student);
    }
}
