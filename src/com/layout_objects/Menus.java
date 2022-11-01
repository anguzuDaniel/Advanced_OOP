package com.layout_objects;

import javax.swing.*;

public class Menus extends JFrame {

    JMenuBar menuBar;
    JMenu menu, subMenu;
    JPanel mainPanel;
    JMenuItem itemOne;
    JMenuItem itemTwo;
    JMenuItem itemThree;

    public Menus() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame menuFrame = new JFrame("Navigation menu");
        menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        menuFrame.setJMenuBar(this.prepare_JMenuBar());
        menuFrame.add(this.prepare_JPanel());
        menuFrame.setVisible(true);
    }

    public final JMenuBar prepare_JMenuBar() {
        menuBar = new JMenuBar();
        menuBar.add(this.prepare_JMenu());
        return menuBar;
    }

    public final JMenu prepare_JMenu() {
        menu = new JMenu("Files");


        menu.add(this.prepare_JMenuItem("New"));
        menu.add(this.prepare_JMenuItem("Open"));
        menu.add(this.prepare_JMenuItem("Open Recent"));

        menu.add(this.prepare_SubJMenuItem("Export"));

        return menu;
    }

    public final JMenuItem prepare_JMenuItem(String name) {
        return new JMenuItem(name);
    }

    public final JMenuItem prepare_SubJMenuItem(String name) {
        subMenu = new JMenu(name);

        subMenu.add(this.prepare_JMenuItem("Files or section to HTML"));
        subMenu.add(this.prepare_JMenuItem("Project to Eclipse"));
        subMenu.add(this.prepare_JMenuItem("Project to zip"));

        return subMenu;
    }

    public final JPanel prepare_JPanel() {
        mainPanel = new JPanel();
        return mainPanel;
    }
}
