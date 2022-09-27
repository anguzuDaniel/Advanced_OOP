package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Card_Layout {
    JFrame home;
    CardLayout cardLayout;

    JPanel JPanelOne;
    JPanel JPanelTwo;

    public Card_Layout() {
        this.prepare_layout();
    }

    public final void prepare_layout() {

        // set the frames look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        home = new JFrame("Using Card Layout");
        home.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the frame

        cardLayout = new CardLayout();

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLayout(cardLayout);
        home.setVisible(true);
    }

    public final JPanel prepare_JPanelOne() {
        JPanelOne = new JPanel();
        return JPanelOne;
    }

    public final JPanel prepare_JPanelTwo() {
        JPanelTwo = new JPanel();
        return JPanelTwo;
    }
}
