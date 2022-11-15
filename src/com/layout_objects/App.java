package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private JLabel firstName;
    private JLabel lastName;
    private JLabel password;
    private JLabel gender;

    private ButtonGroup genderGroup;

    public App() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame appFrame = new JFrame("Registration Form");
        appFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();

        GridLayout gridLayout = new GridLayout(0, 3);

        appFrame.setLayout(gridLayout);

        appFrame.add(p);
        appFrame.add(this.prepareFormPanel());

        appFrame.add(p1);
        appFrame.setVisible(true);
    }

    public final JPanel prepareForm() {
        JPanel panel = new JPanel();
        JPanel p = new JPanel();
        GridLayout gL = new GridLayout(3, 0);

        panel.setLayout(gL);
        panel.add(p);
        panel.add(this.prepareFormPanel());

        return panel;
    }


    public final JPanel prepareFormPanel() {
        firstName = new JLabel("First Name");
        lastName = new JLabel("Last Name");
        password = new JLabel("Password");
        gender = new JLabel("Gender");
        Font myFont = new Font("iNK Free", Font.BOLD, 15);

        JPanel fromFrame = new JPanel();

        fromFrame.setLayout(null);

        JPanel formPanel = new JPanel();
        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JRadioButton maleRadio = new JRadioButton("male");
        JRadioButton femaleRadio = new JRadioButton("female");
        genderGroup = new ButtonGroup();

        formPanel.setLayout(null);

        maleRadio.setActionCommand("male");
        femaleRadio.setActionCommand("female");

        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JButton submitBtn = new JButton("REGISTER");

        fromFrame.add(this.firstName);
        fromFrame.add(firstNameField);
        this.firstName.setBounds(50, 10, 100, 35);
        this.firstName.setFont(myFont);
        firstNameField.setBounds(50, 50, 300, 35);

        fromFrame.add(this.lastName);
        fromFrame.add(lastNameField);
        this.lastName.setBounds(50, 90, 100, 35);
        this.lastName.setFont(myFont);
        lastNameField.setBounds(50, 130, 300, 35);

        fromFrame.add(this.password);
        fromFrame.add(passwordField);
        this.password.setBounds(50, 170, 100, 35);
        this.password.setFont(myFont);
        passwordField.setBounds(50, 210, 300, 35);

        fromFrame.add(this.gender);
        this.gender.setBounds(50, 260, 50, 20);
        this.gender.setFont(myFont);

        fromFrame.add(maleRadio);
        maleRadio.setBounds(150, 260, 80, 20);

        fromFrame.add(femaleRadio);
        femaleRadio.setBounds(250, 260, 80, 20);

        fromFrame.add(submitBtn);
        submitBtn.setBounds(50, 300, 100, 30);
        submitBtn.setFocusable(false);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = firstNameField.getText().toString() + " " + lastNameField.getText().toString();
                String userPassword = passwordField.getText().toString();
                String userGender =  genderGroup.getSelection().toString();

                System.out.println("User name: " + username + ", \n Password: " + userPassword + "\n Gender: " + userGender);
            }
        });

        return fromFrame;
    }
}
