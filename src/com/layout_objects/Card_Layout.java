package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Card_Layout {
    JFrame home;
    CardLayout cardLayout;
    JPanel JPanelOne, JPanelTwo, JPanelThree, JPanelFour;
    JButton buttonOne, buttonTwo;

    public Card_Layout() {
        this.prepare_layout();
    }

    public final void prepare_layout() {

        // set the frames look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        home = new JFrame("Using Card Layout");
        home.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the frame

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLayout(cardLayout);
        home.setVisible(true);
    }

    public final JPanel prepare_JPanelOne() {
        JPanelOne = new JPanel();
        cardLayout = new CardLayout();
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
        return JPanelTwo;
    }

    public final JPanel prepare_JPanelThree() {
        JPanelThree = new JPanel();
        JPanelThree.setBorder(BorderFactory.createTitledBorder("Panel Three"));
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
        return buttonOne;
    }

    public final JButton prepareButtonTwo() {
        buttonTwo = new JButton("Display panel Two");
        return buttonTwo;
    }
}
