package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card_Layout {
    JFrame home;
    CardLayout cardLayout;
    JPanel JPanelOne, JPanelTwo, JPanelThree, JPanelFour;
    JButton buttonOne, buttonTwo;

    public Card_Layout() {this.prepare_layout();}

    public final void prepare_layout() {

        // sets the frames look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        cardLayout = new CardLayout();

        home = new JFrame("Using Card Layout");
        home.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the frame
        home.add(this.prepare_JPanelOne(), BorderLayout.NORTH);
        home.add(this.prepare_JPanelFour(), BorderLayout.SOUTH);

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLayout(cardLayout);
        home.setVisible(true);
    }

    public final JPanel prepare_JPanelOne() {
        JPanelOne = new JPanel();

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

        // listens for action ton the button
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(JPanelTwo, "Panel Two");
            }
        });

        return buttonOne;
    }

    public final JButton prepareButtonTwo() {
        buttonTwo = new JButton("Display panel Two");

        // listens for action ton the button
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(JPanelThree, "Panel Three");
            }
        });
        return buttonTwo;
    }
}
