package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public App() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame registerForm = new JFrame("Registration Form");
        JPanel formPanel = new JPanel();

        registerForm.setExtendedState(JFrame.MAXIMIZED_BOTH);

        GridLayout gridLayout = new GridLayout(0, 1);

        registerForm.setLayout(gridLayout);


        formPanel.setBorder(BorderFactory.createEtchedBorder());
        formPanel.setLayout(null);
        formPanel.add(this.prepareForm());

        registerForm.add(formPanel);

        registerForm.setVisible(true);
    }

    public final JPanel prepareForm() {
        JPanel form = new JPanel();

        form.setLayout(new GridLayout(11, 1));

        // app title
        form.add(this.prepareAppTitle());

        // first name
        form.add(this.prepareLabel("FirstName"));
        form.add(this.prepareTextField());

        // last name
        form.add(this.prepareLabel("Last Name"));
        form.add(this.prepareTextField());

        // password
        form.add(this.prepareLabel("Password"));
        form.add(this.preparePassword());

        // gender radio button
        form.add(this.prepareLabel("Gender"));

        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");

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

        // submit button
        form.add(this.prepareButton());

        form.setBounds(450, 100, 500, 500);

        return form;
    }

    private JLabel prepareAppTitle() {
        JLabel label = new JLabel("Register Student");
        Font font = new Font(null, Font.BOLD, 30);
        label.setFont(font);
        return label;
    }

    private JLabel prepareLabel(String title) {
        JLabel label = new JLabel(title);
        Font font = new Font(null, Font.BOLD, 18);
        label.setFont(font);
        return label;
    }

    private JTextField prepareTextField() {
        return new JTextField();

    }

    private JPasswordField preparePassword() {
        return new JPasswordField();
    }

    private JButton prepareButton() {
        JButton register = new JButton("REGISTER");
        register.setFocusable(false);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = preparePassword().getText();
                System.out.println(password);
            }
        });

        return register;
    }
}
