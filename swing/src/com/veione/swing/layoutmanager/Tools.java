package com.veione.swing.layoutmanager;

import javax.swing.*;
import java.awt.*;

/**
 * Swing工具类
 * Created by veione on 5/9/16.
 */
public class Tools {

    /**
     * 设置窗口居中显示
     *
     * @param window 窗口对象
     */
    public static void centerWindow(Window window) {
        int wWidth = window.getWidth();
        int wHeight = window.getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int x = (int) (dimension.getWidth() - wWidth) / 2;
        int y = (int) (dimension.getHeight() - wHeight) / 2;
        window.setLocation(x, y);
    }

    /**
     * 获取系统可用的主题皮肤
     *
     * @return 主题集合类
     */
    public static UIManager.LookAndFeelInfo[] getSkins() {
        return UIManager.getInstalledLookAndFeels();
    }
}
