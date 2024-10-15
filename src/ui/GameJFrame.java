package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();

        this.setVisible(true);
    }

    private void initJMenuBar() {
        JMenuBar jmb = new JMenuBar();

        JMenu functionJM = new JMenu("功能");
        JMenu aboutJM = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        jmb.add(functionJM);
        jmb.add(aboutJM);
        functionJM.add(replayItem);
        functionJM.add(reLoginItem);
        functionJM.add(closeItem);

        this.setJMenuBar(jmb);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("益智拼图");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
    }
}
