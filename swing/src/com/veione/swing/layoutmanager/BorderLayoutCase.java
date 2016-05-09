package com.veione.swing.layoutmanager;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout
 * Created by veione on 5/9/16.
 */
public class BorderLayoutCase {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tools.centerWindow(frame);

        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);

        JButton btnLife = new JButton("生活");
        JButton btnWork = new JButton("工作");
        JButton btnSleep = new JButton("睡觉");
        JButton btnShopping = new JButton("购物");
        JButton btnFood = new JButton("饮食");

        //创建一个布局管理器,将中间容器设置为此布局管理器
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        contentPane.add(btnLife, BorderLayout.NORTH);
        contentPane.add(btnWork, BorderLayout.SOUTH);
        contentPane.add(btnSleep, BorderLayout.EAST);
        contentPane.add(btnShopping, BorderLayout.WEST);
        contentPane.add(btnFood, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

