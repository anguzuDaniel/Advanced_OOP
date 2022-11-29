package com.layout_objects;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        Border_layout border_layout = new Border_layout();
//        Card_Layout card_layout = new Card_Layout();
//        Card_layout2 card_layout2 = new Card_layout2();
//        Gb_Layout gb_layout = new Gb_Layout();
//        Menus menus = new Menus();
//        NestedMenu nestedMenu = new NestedMenu();
//        TestWork testWork = new TestWork();
//        Tab tab = new Tab();
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//            App app = new App();
            Tab tab = new Tab();
//        Test3 test3 = new Test3();
        } catch (Exception e) {
        }
    }
}