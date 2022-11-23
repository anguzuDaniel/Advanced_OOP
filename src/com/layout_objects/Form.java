package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Form {
    public JPasswordField passwordField;

    public Form() {
        passwordField = new JPasswordField();
    }

    public final JPanel prepareForm() {
        JPanel form = new JPanel();

        // form.setLayout(new GridLayout(14, 2));
        form.setLayout(null);

        // app title
        // form.add(this.prepareAppTitle(0, 0, 500, 50));
        // first name
        form.add(this.prepareLabel("First Name", 0, 500));
        form.add(this.prepareTextField(40));

        // first name
        form.add(this.prepareLabel("Last Name", 100, 500));
        form.add(this.prepareTextField(140));

//        // last name
//        form.add(this.prepareLabel("Last Name", 0, 140, 500, 50));
//        form.add(this.prepareTextField(0, 180, 500, 50));

        // password
        form.add(this.prepareLabel("Password", 200, 500));
        form.add(this.preparePassword());


        // gender radio button
        form.add(this.prepareLabel("Gender", 240, 100));

        // radio buttons
        JRadioButton male = new JRadioButton("male");
        male.setBounds(100, 240, 100, 50);
        JRadioButton female = new JRadioButton("female");
        female.setBounds(200, 240, 100, 50);

        // button group - this adds groups the buttons
        ButtonGroup genderGroup = new ButtonGroup();

        male.setActionCommand("male");
        female.setActionCommand("female");

        male.setFocusable(false);
        female.setFocusable(false);

        male.isSelected();

        genderGroup.add(male);
        genderGroup.add(female);

        form.add(male);
        form.add(female);

        // calender
        form.add(this.prepareCalendar());

        // submit button
        form.add(this.prepareButton());

        form.setBounds(100, 20, 500, 800);

        return form;
    }

    private JLabel prepareAppTitle(int r, int l, int w, int h) {
        JLabel label = new JLabel("Register Student");
        label.setBounds(r, l, w, h);
        Font font = new Font(null, Font.BOLD, 30);
        label.setFont(font);
        return label;
    }

    private JLabel prepareLabel(String title, int marginTop, int width) {
        JLabel label = new JLabel(title);
        label.setBounds(0, marginTop, width, 50);
        Font font = new Font(null, Font.BOLD, 18);
        label.setFont(font);
        return label;
    }

    private JTextField prepareTextField(int top) {
        JTextField textField = new JTextField();
        textField.setBounds(0, top, 500, 50);
        return textField;
    }

    private JPasswordField preparePassword() {
        passwordField = new JPasswordField();
        passwordField.setBounds(0, 240, 500, 50);
        return passwordField;
    }

    // prepare our submit button
    private JButton prepareButton() {
        JButton register = new JButton("REGISTER");
        register.setFocusable(false);
        register.setBounds(0, 520, 500, 50);

        // adds a listener to the button
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        return register;
    }

    // returns a panel that has a calendar
    private JPanel prepareCalendar() {
        // creates the JCalendar instance from our imported library
        com.toedter.calendar.JCalendar myJCalendar = new com.toedter.calendar.JCalendar();
        myJCalendar.setBounds(0, 10, 500, 220);

        // panel on with our calendar is placed
        JPanel panel = new JPanel();
        panel.add(myJCalendar);
        panel.setLayout(null);
        panel.setBounds(0, 300, 500, 220);

        // Get Date Button
        JButton CalendarJButton = new JButton("GET-DATE");
        panel.add(CalendarJButton);

        CalendarJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar mCalendar = myJCalendar.getCalendar();
                JLabel label = new JLabel();
                int dateVar = mCalendar.get(Calendar.DATE);
                String StringDateVar = String.valueOf(dateVar);

                int monthVar = mCalendar.get(Calendar.MONTH);
                String StringMonthVar = String.valueOf(monthVar);

                int yearVar = mCalendar.get(Calendar.YEAR);
                String StringYearVar = String.valueOf(yearVar);

                label.setText(StringDateVar + "/" + StringMonthVar + "/" + StringYearVar);
            }
        });
        return panel;
    }
}
