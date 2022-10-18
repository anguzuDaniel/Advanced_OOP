package com.layout_objects;

import javax.swing.*;

public class menus {

    public menus() {
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame menu_frame = new JFrame("Grid Bag Layout Frame");
        menu_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);



        menu_frame.setSize(500, 500);
        menu_frame.setVisible(true);
    }

    public final JMenuBar prepareMenuBar() {
        
    }
}
