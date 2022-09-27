package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Border_layout {

    JFrame home;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    public Border_layout() {
       home = new JFrame("Using a border layout.");

       // using the gridlayout
       home.setLayout(new GridLayout(3, 2));

       this.prepareLayout();
    }

    public final void prepareLayout() {
        home = new JFrame();

        // adding methods that return buttons
        // this is for more organized work.
        home.add(this.prepareButtonOne());
        home.add(this.prepareButtonTwo());
        home.add(this.prepareButtonThree());
        home.add(this.prepareButtonFour());

        home.setSize(500, 500);
        home.setVisible(true);
    }

    public final JButton prepareButtonOne() {
        button1 = new JButton("Button 1");
        return button1;
    }

    public final JButton prepareButtonTwo() {
        button2 = new JButton("Button 2");
        return button2;
    }

    public final JButton prepareButtonThree() {
        button3 = new JButton("Button 2");
        return button3;
    }

    public final JButton prepareButtonFour() {
        button4 = new JButton("Button 4");
        return button4;
    }
}
