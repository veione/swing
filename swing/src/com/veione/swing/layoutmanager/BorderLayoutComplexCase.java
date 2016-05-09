package com.veione.swing.layoutmanager;

import javax.swing.*;
import java.awt.*;

/**
 * 复杂的BorderLayout
 * Created by veione on 5/9/16.
 */
public class BorderLayoutComplexCase {
    private static final int WIDTH=300;
    private static final int HEIGHT=200;

    public static void main(String[] args) {
        JFrame frame=new JFrame("BorderLayoutComplex");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tools.centerWindow(frame);

        JPanel contentPane=new JPanel();
        frame.setContentPane(contentPane);

        //创建25个普通按钮组件
        JButton hk=new JButton("港币");
        JButton rmb=new JButton("人民币");
        JButton dollar=new JButton("美元");
        JButton euro=new JButton("欧元");
        JButton pound=new JButton("英镑");

        JButton mainBoard=new JButton("主板");
        JButton memory=new JButton("内存");
        JButton hardDisk=new JButton("硬盘");
        JButton monitor=new JButton("显示器");
        JButton mouse=new JButton("鼠标");

        JButton rice=new JButton("大米");
        JButton vegetables=new JButton("蔬菜");
        JButton daozi=new JButton("稻子");
        JButton pork=new JButton("猪肉");
        JButton beef=new JButton("牛肉");

        JButton bread=new JButton("面包");
        JButton cake=new JButton("蛋糕");
        JButton chcolate=new JButton("巧克力");
        JButton cheese=new JButton("奶酪");
        JButton applePie=new JButton("苹果派");

        JButton notebook=new JButton("笔记本");
        JButton phone=new JButton("电话");
        JButton desk=new JButton("办工桌");
        JButton pen=new JButton("钢笔");
        JButton files=new JButton("文件夹");

        //设置为BorderLayout布局管理器
        frame.setLayout(new BorderLayout());

        //创建5个中间容器,并且将它们的布局管理器设置为BorderLayout方式
        JPanel moneyPane=new JPanel();
        JPanel pcPane=new JPanel();
        JPanel foodPane=new JPanel();
        JPanel snakePane=new JPanel();
        JPanel officePane=new JPanel();
        moneyPane.setLayout(new BorderLayout());
        pcPane.setLayout(new BorderLayout());
        foodPane.setLayout(new BorderLayout());
        snakePane.setLayout(new BorderLayout());
        officePane.setLayout(new BorderLayout());

        //将5个中间容器分别添加到上层中间容器中
        contentPane.add(moneyPane,BorderLayout.NORTH);
        contentPane.add(pcPane,BorderLayout.SOUTH);
        contentPane.add(foodPane,BorderLayout.WEST);
        contentPane.add(snakePane,BorderLayout.EAST);
        contentPane.add(officePane,BorderLayout.CENTER);

        //分别将控件添加到指定的面板容器中
        moneyPane.add(moneyPane,BorderLayout.NORTH);
        moneyPane.add(pcPane,BorderLayout.SOUTH);
        moneyPane.add(foodPane,BorderLayout.WEST);
        moneyPane.add(snakePane,BorderLayout.EAST);
        moneyPane.add(officePane,BorderLayout.CENTER);


        frame.setVisible(true);
    }
}

