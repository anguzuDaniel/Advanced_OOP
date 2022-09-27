package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Border_layout {

    JFrame home;
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;

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
        buttonOne = new JButton("Button 1");
        return buttonOne;
    }

    public final JButton prepareButtonTwo() {
        buttonTwo = new JButton("Button 2");
        return buttonTwo;
    }

    public final JButton prepareButtonThree() {
        buttonThree = new JButton("Button 2");
        return buttonThree;
    }

    public final JButton prepareButtonFour() {
        buttonFour = new JButton("Button 4");
        return buttonFour;
    }
}
