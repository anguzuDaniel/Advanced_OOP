package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Gb_Layout {
    JFrame home;

    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    GridBagConstraints GBC;

    public Gb_Layout() {
        GBC = new GridBagConstraints();
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame gb_Layout_Frame = new JFrame("Grid Bag Layout Frame");
        gb_Layout_Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        GridBagLayout  gb_layout = new GridBagLayout();

        gb_Layout_Frame.setLayout(gb_layout);

        gb_Layout_Frame.add(this.prepare_JButtonOne());
        gb_Layout_Frame.add(this.prepare_JButtonTwo());
        gb_Layout_Frame.add(this.prepare_JButtonTwo());

        gb_Layout_Frame.setSize(500, 500);
        gb_Layout_Frame.setVisible(true);
    }

    public final JButton prepare_JButtonOne() {
        buttonOne = new JButton("Button One");

        GBC.fill = GridBagConstraints.HORIZONTAL;
        GBC.gridx = 0;
        GBC.gridy = 0;

        return buttonOne;
    }

    public final JButton prepare_JButtonTwo() {
        buttonTwo = new JButton("Button One");

        GBC.fill = GridBagConstraints.HORIZONTAL;
        GBC.gridx = 1;
        GBC.gridy = 0;

        return buttonTwo;
    }

    public final JButton prepare_JButtonThree() {
        buttonThree = new JButton("Button One");

        GBC.fill = GridBagConstraints.HORIZONTAL;
        GBC.gridx = 0;
        GBC.gridy = 0;
        GBC.gridwidth = 3;

        return buttonThree;
    }
}
