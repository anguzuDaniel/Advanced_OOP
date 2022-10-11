package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Card_Layout {
    JFrame home;
    CardLayout cardLayout;
    JPanel JPanelOne, JPanelTwo, JPanelThree, JPanelFour;
    JButton buttonOne, buttonTwo;

    public Card_Layout() { this.prepare_layout(); }

    public final void prepare_layout() {

        // sets the frames look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        home = new JFrame("Using Card Layout");

        cardLayout = new CardLayout();

        home.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the frame
        home.add(this.prepare_JPanelOne());
        home.add(this.prepare_JPanelFour(), BorderLayout.SOUTH);

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        home.setVisible(true);
    }

    public final JPanel prepare_JPanelOne() {
        JPanelOne = new JPanel();

        buttonTwo = new JButton("Display panel Two");

        JPanelOne.setLayout(cardLayout);

        // add panel two and three to panel one
        JPanelOne.add(this.prepare_JPanelTwo(), "Panel Two");
        JPanelOne.add(this.prepare_JPanelThree(), "Panel Three");

        JPanelOne.setBorder(BorderFactory.createTitledBorder("Panel One"));

        return JPanelOne;
    }


    public final JPanel prepare_JPanelTwo() {
        JPanelTwo = new JPanel();
        JPanelTwo.setBorder(BorderFactory.createTitledBorder("Panel Two"));
        JPanelTwo.setBackground(Color.cyan);
        return JPanelTwo;
    }

    public final JPanel prepare_JPanelThree() {
        JPanelThree = new JPanel();
        JPanelThree.setBorder(BorderFactory.createTitledBorder("Panel Three"));
        JPanelThree.setBackground(Color.GREEN);
        return JPanelThree;
    }

    public final JPanel prepare_JPanelFour() {
        JPanelFour = new JPanel();

        // adds button's one and two to panel four
        JPanelFour.add(this.prepareButtonOne());
        JPanelFour.add(this.prepareButtonTwo());

        JPanelFour.setBorder(BorderFactory.createTitledBorder("Panel Four"));
        return JPanelFour;
    }

    public final JButton prepareButtonOne() {
        buttonOne = new JButton("Display panel One");

        // listens for action ton the button
        this.buttonOne.addActionListener(e -> cardLayout.show(JPanelOne, "Panel Two"));

        return buttonOne;
    }

    public final JButton prepareButtonTwo() {
        buttonTwo = new JButton("Display panel Two");

        // listens for action ton the button
        this.buttonTwo.addActionListener(e -> cardLayout.show(JPanelOne, "Panel Three"));

        return buttonTwo;
    }
}
