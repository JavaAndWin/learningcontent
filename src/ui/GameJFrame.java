package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {

    int[][] data = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
    //空白方块的位置
    int x = 0;
    int y = 0;

    //计数器
    int stepnum = 0;
    //当前使用图片
    String path = "image\\girl\\girl1\\";

    //随机数
    Random r = new Random();

    public GameJFrame() {


        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据打乱
        initData();
        //初始化图形界面
        initImage();
        this.setVisible(true);
    }

    private void initData() {
        stepnum = 0;
        //打乱数组
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int tempx = r.nextInt(4);
                int tempy = r.nextInt(4);
                temp = data[i][j];
                data[i][j] = data[tempx][tempy];
                data[tempx][tempy] = temp;
            }
        }
        //遍历二维数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j] + " ");
                if (data[i][j] == 16) {
                    x = i;
                    y = j;
                }
            }
            System.out.println();
        }

    }

    //初始化图片
    private void initImage() {

        //清空
        this.getContentPane().removeAll();

        //计数器
        JLabel step = new JLabel("步数：" + stepnum);
        step.setBounds(50,30,100,20);
        this.getContentPane().add(step);

        //判断胜利
        if (victory()) {
            JLabel win = new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }

        //添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jlabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));

                //确定空白格位置并创建空白格
                if (data[i][j] == 16) {
                    x = i;
                    y = j;
                    jlabel = new JLabel(new ImageIcon());
                }
                jlabel.setBounds(83 + 105 * j, 134 + 105 * i, 105, 105);
                jlabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jlabel);
            }
        }

        //添加背景图片
        JLabel bg = new JLabel(new ImageIcon("image\\background.png"));
        bg.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bg);

        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        JMenuBar jmb = new JMenuBar();

        JMenu functionJM = new JMenu("功能");
        JMenu aboutJM = new JMenu("关于我们");

        //更换图片菜单
        JMenu changeimg = new JMenu("更换图片");
        JMenuItem animalimg = new JMenuItem("动物");
        JMenuItem girlimg = new JMenuItem("美女");
        JMenuItem sportimg = new JMenuItem("运动");
        changeimg.add(animalimg);
        changeimg.add(girlimg);
        changeimg.add(sportimg);

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem girl = new JMenuItem("美女");

        functionJM.add(changeimg);
        jmb.add(functionJM);
        jmb.add(aboutJM);
        functionJM.add(replayItem);
        functionJM.add(reLoginItem);
        functionJM.add(closeItem);
        aboutJM.add(girl);


        //菜单的点击功能

        //切换图片功能
        animalimg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                path = "image\\animal\\animal" + r.nextInt(1, 9) + "\\";
                initImage();
            }
        });

        girlimg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                path = "image\\girl\\girl" + r.nextInt(1, 14) + "\\";
                initImage();
            }
        });

        sportimg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                path = "image\\sport\\sport" + r.nextInt(1, 11) + "\\";
                initImage();
            }
        });

        //重玩
        replayItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initData();
                initImage();
            }
        });

        reLoginItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new LoginJDialog();
            }
        });
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //关于我们 美女
        girl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                JLabel jLabel = new JLabel(new ImageIcon(path + "all.jpg"));
                jLabel.setBounds(0, 0, 300, 300);

                //窗口打开时不能操作其他窗口
                JDialog modalDialog = new JDialog(new JFrame(),"美女",true); // true 表示模态
                modalDialog.setSize(400, 400);
                modalDialog.setLocationRelativeTo(null);
                modalDialog.setAlwaysOnTop(true);
                modalDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

                modalDialog.add(jLabel);
                modalDialog.setVisible(true);
            }
        });



        this.setJMenuBar(jmb);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("益智拼图");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.addKeyListener(this);
        //取消默认居中
        this.setLayout(null);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 65) {

            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //添加背景图片
            JLabel bg = new JLabel(new ImageIcon("image\\background.png"));
            bg.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bg);
            //刷新
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断胜利
        if(victory()) return;
        switch (e.getKeyCode()) {
            case 37 -> {
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 16;
                y++;
                stepnum++;
                initImage();
            }
            case 38 -> {
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 16;
                x++;
                stepnum++;
                initImage();
            }
            case 39 -> {
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 16;
                y--;
                stepnum++;
                initImage();
            }
            case 40 -> {
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 16;
                x--;
                stepnum++;
                initImage();
            }
            case 65 -> initImage();

            case 87 -> {
                data = new int[][]{{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
                x = 3;
                y = 3;
            }

        }
        initImage();
    }

    public boolean victory() {
        int[][] win = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (data[i][j] == win[i][j]) {
                    count++;
                }
            }
        }
        if (count == 16) {
            return true;
        }
        return false;
    }
}
