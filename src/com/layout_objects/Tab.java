package com.layout_objects;

import javax.swing.*;

public class Tab {

    // Tab constructor
    // calls the prepareLayout method
    public Tab() {
        this.prepareLayout();
    }

    // creates a frame, and adds the prepareTab()
    // sets look and feel
    // sets visibility
    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame tabFrame = new JFrame("Tabbed layouts");
        tabFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tabFrame.add(this.prepareTab());
        tabFrame.setVisible(true);
    }

    // creates an instance of the JPanel class
    // sets border layout
    // returns the instance
    private JPanel preparePanel(String name) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(name));
        return panel;
    }

    // prepares the JTabbedPane
    // adds all the panels to the JTabbedPane by calling the preparePanel()
    // returns the tab
    private JTabbedPane prepareTab() {
        JTabbedPane mainTab = new JTabbedPane();
        mainTab.addTab("Tab one", this.preparePanel("Border Five"));
        mainTab.addTab("Tab Two", this.preparePanel("Border Two"));
        mainTab.addTab("Tab Three", this.preparePanel("Border Three"));
        mainTab.addTab("Tab Four", this.preparePanel("Border Four"));
        return mainTab;
    }
}
