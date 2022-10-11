package com.layout_objects;

import javax.swing.*;

public class Gb_Layout {
    JFrame home;

    public Gb_Layout() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        home = new JFrame();

        home.setSize(500, 500);
        home.setVisible(true);
    }
}
