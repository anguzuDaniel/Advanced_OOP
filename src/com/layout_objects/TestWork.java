package com.layout_objects;

import javax.swing.*;

public class TestWork {

    public TestWork() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();

        JMenuBar nav = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu e = new JMenu("Edit");

        JMenuItem p = new JMenuItem("Project");
        JMenuItem open = new JMenuItem("Open");

        JMenu f = new JMenu("New");
        f.add(p);

        JMenuItem u = new JMenuItem("Undo");
        JMenuItem copy = new JMenuItem("Copy");

        file.add(file);
        file.add(e);

        file.add(open);
        file.add(f);

        e.add(u);
        e.add(copy);

        nav.add(file);
        nav.add(e);

        frame.setJMenuBar(nav);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}

