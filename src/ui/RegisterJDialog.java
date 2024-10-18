package ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterJDialog extends JDialog implements MouseListener {

    //界面左上角坐标
    int x = 120;
    int y = 180;

    //声明按钮
    JButton register = new JButton(new ImageIcon("image\\register\\注册按钮.png"));
    JButton reSet = new JButton(new ImageIcon("image\\register\\重置按钮.png"));

    //声明输入框
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();

    public RegisterJDialog() {

        //初始化界面
        initFrame();

        //初始化按键
        initButton();

        //初始化输入
        initInput();

        //初始化图片
        initImage();



        this.setVisible(true);
    }

    private void initInput() {


        text1.setBounds(x + 90, y, 130, 25);
        text2.setBounds(x + 90, y + 50, 130, 25);



        this.getContentPane().add(text1);
        this.getContentPane().add(text2);

    }

    private void initImage() {

        //用户名 密码
        JLabel usernameIcon = new JLabel(new ImageIcon("image\\register\\注册用户名.png"));
        JLabel passwordIcon = new JLabel(new ImageIcon("image\\register\\注册密码.png"));
        usernameIcon.setBounds(x, y, 79, 17);
        passwordIcon.setBounds(x, y + 50, 64, 16);

        this.getContentPane().add(usernameIcon);
        this.getContentPane().add(passwordIcon);

        //设置背景图
        JLabel bg = new JLabel(new ImageIcon("image\\register\\background.png"));
        bg.setBounds(0, 0, 470, 390);
        this.getContentPane().add(bg);

    }

    private void initButton() {

        register.setBounds(x-20, y + 170, 126, 46);
        reSet.setBounds(x-20 + 150, y + 170, 126, 46);

        //去掉边界
        register.setContentAreaFilled(false);
        register.setBorderPainted(false);
        reSet.setContentAreaFilled(false);
        reSet.setBorderPainted(false);

        //添加按钮鼠标事件
        register.addMouseListener(this);
        reSet.addMouseListener(this);

        this.getContentPane().add(register);
        this.getContentPane().add(reSet);
    }

    private void initFrame() {
        this.setSize(488, 500);
        this.setTitle("拼图 注册");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(3);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == register) {
            System.out.println(text1.getText());
            System.out.println(text2.getText());
        } else if (e.getSource() == reSet) {
            text1.setText("");
            text2.setText("");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == register) {
            register.setIcon(new ImageIcon("E:\\JAVAcode\\jigsawgame\\image\\register\\注册按下.png"));
        } else if (e.getSource() == reSet) {
            reSet.setIcon(new ImageIcon("E:\\JAVAcode\\jigsawgame\\image\\register\\重置按下.png"));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == register) {
            register.setIcon(new ImageIcon("E:\\JAVAcode\\jigsawgame\\image\\register\\注册按钮.png"));
        } else if (e.getSource() == reSet) {
            reSet.setIcon(new ImageIcon("E:\\JAVAcode\\jigsawgame\\image\\register\\重置按钮.png"));
        }
    }
}
