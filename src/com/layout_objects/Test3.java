package com.layout_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3  {
    private CardLayout cardLayout;
    private JPanel tabbedPanel;
    private JButton button;

    public Test3() {
        tabbedPanel = new JPanel();
        this.prepareLayout();
    }

    public final void prepareLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame home = new JFrame("Tab navigation");

        home.setExtendedState(JFrame.MAXIMIZED_BOTH);

        home.add(this.buttonPanel(), BorderLayout.NORTH);
        home.add(this.prepareNavPane("Main Tab"));

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
    }

    public final JPanel prepareNavPane(String name) {
        cardLayout = new CardLayout();
        tabbedPanel.setLayout(cardLayout);

        tabbedPanel.setBorder(BorderFactory.createTitledBorder(name));

        tabbedPanel.add(this.preparePanel("Tab One"), "Tab one");
        tabbedPanel.add(this.preparePanel("Tab Two"), "Tab two");
        tabbedPanel.add(this.preparePanel("Tab Three"), "Tab three");

        return tabbedPanel;
    }

    public final JPanel preparePanel(String name) {
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createTitledBorder(name));

        return panel;
    }

    public final JPanel buttonPanel() {
        JPanel btnPanel = new JPanel();

        btnPanel.add(this.prepareBtnOne("Tab one"));
        btnPanel.add(this.prepareBtnTwo("Tab two"));
        btnPanel.add(this.prepareBtnThree("Tab three"));

        return btnPanel;
    }

    public final JButton prepareBtnOne(String title) {
        button = new JButton(title);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(tabbedPanel, "Tab one");
            }
        });

        return button;
    }

    public final JButton prepareBtnTwo(String title) {
        button = new JButton(title);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(tabbedPanel, "Tab two");
            }
        });

        return button;
    }

    public final JButton prepareBtnThree(String title) {
        button = new JButton(title);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(tabbedPanel, "Tab three");
            }
        });

        return button;
    }
}
