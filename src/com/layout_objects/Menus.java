package com.layout_objects;

import javax.swing.*;

public class Menus {

    JMenuBar menuBar;
    JMenu menu;

    public Menus() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame menuFrame = new JFrame("Navigation menu");
        menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        menuFrame.add(this.prepare_JMenuBar());

        menuFrame.setSize(500, 500);
        menuFrame.setVisible(true);
    }

    public final JMenuBar prepare_JMenuBar() {
        menuBar = new JMenuBar();
        return menuBar;
    }

    public final JMenu prepare_JMenu() {
        menu = new JMenu();
        return menu;
    }
}
