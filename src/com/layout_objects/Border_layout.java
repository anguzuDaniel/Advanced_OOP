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


       button2 = new JButton();
       button3 = new JButton();
       button4 = new JButton();

       // using BorderLayout to set location of the buttons
       home.add(button4, BorderLayout.CENTER);
       home.add(button3, BorderLayout.NORTH);
       home.add(button2, BorderLayout.EAST);
       home.add(button1, BorderLayout.WEST);

       this.prepareLayout();
    }

    public final void prepareLayout() {
        home = new JFrame();

        // adding methods that return buttons
        // this is for more organized work.
        home.add(this.prepareButton1());
        home.add(this.prepareButton2());
        home.add(this.prepareButton3());
        home.add(this.prepareButton4());

        home.setSize(500, 500);
        home.setVisible(true);

        this.prepareLayout();
    }

    public final JButton prepareButton1() {
        button1 = new JButton();
        return button1;
    }

    public final JButton prepareButton2() {
        button2 = new JButton();
        return button2;
    }

    public final JButton prepareButton3() {
        button3 = new JButton();
        return button3;
    }

    public final JButton prepareButton4() {
        button4 = new JButton();
        return button4;
    }
}
