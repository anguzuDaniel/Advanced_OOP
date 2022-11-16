package com.layout_objects;

import javax.swing.*;

public class NestedMenu {

    public NestedMenu() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setJMenuBar(this.prepareNavMenu());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private JMenuBar prepareNavMenu() {
        JMenuBar navBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem project = new JMenuItem("Project.");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem export = new JMenuItem("Export Project");

        JMenu newFile = new JMenu("New");
        newFile.add(project);
        newFile.add(export);

        JMenuItem undo = new JMenuItem("Undo Recent");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");

        file.add(file);
        file.add(edit);

        file.add(newFile);
        file.add(open);

        edit.add(undo);
        edit.add(cut);
        edit.add(copy);

        navBar.add(file);
        navBar.add(edit);

        return navBar;
    }
}
