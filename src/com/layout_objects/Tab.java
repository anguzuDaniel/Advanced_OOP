package com.layout_objects;

import javax.swing.*;

public class Tab {

    public Tab() {
        JPanel tabbedPanel = new JPanel();
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame tabFrame = new JFrame("Grid Bag Layout Frame");
        tabFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tabFrame.add(this.prepareTab());
        tabFrame.setVisible(true);
    }

    private JPanel prepareLabelPane(String name) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(name));
        return panel;
    }

    private JTabbedPane prepareTab() {
        JTabbedPane mainTab = new JTabbedPane();
        mainTab.addTab("Tab one", this.prepareLabelPane("Border Five"));
        mainTab.addTab("Tab Two", this.prepareLabelPane("Border Two"));
        mainTab.addTab("Tab Three", this.prepareLabelPane("Border Three"));
        mainTab.addTab("Tab Four", this.prepareLabelPane("Border Four"));
        return mainTab;
    }
}
