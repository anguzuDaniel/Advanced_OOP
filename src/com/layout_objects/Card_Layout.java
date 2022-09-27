package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Card_Layout {
    JFrame home;
    CardLayout cardLayout;

    JPanel JPanelOne;
    JPanel JPanelTwo;
    JPanel JPanelThree;
    JPanel JPanelFour;

    public Card_Layout() {
        this.prepare_layout();
    }

    public final void prepare_layout() {

        // set the frames look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        home = new JFrame("Using Card Layout");
        home.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the frame

        cardLayout = new CardLayout();

        home.add(this.prepare_JPanelOne());
        home.add(this.prepare_JPanelTwo());
        home.add(this.prepare_JPanelThree());
        home.add(this.prepare_JPanelFour());

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLayout(cardLayout);
        home.setVisible(true);
    }

    public final JPanel prepare_JPanelOne() {
        JPanelOne = new JPanel();
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
        JPanelFour.setBorder(BorderFactory.createTitledBorder("Panel Four"));
        return JPanelFour;
    }
}
