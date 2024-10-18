package ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginJDialog extends JDialog implements MouseListener {

    //定义输入界面左上角位置
    final int loginx = 120;
    final int loginy = 120;

    JButton login = new JButton(new ImageIcon("image\\login\\登录按钮.png"));
    JButton register = new JButton(new ImageIcon("image\\login\\注册按钮.png"));
    JButton showpassword = new JButton(new ImageIcon("image\\login\\显示密码.png"));

    public LoginJDialog() {

        //初始化界面
        initFrame();

        //初始化按钮
        initButton();

        //初始化输入
        initinput();

        //初始化图片
        initimage();

        //背景图片
        JLabel jLabel = new JLabel(new ImageIcon("image\\login\\background.png"));
        this.getContentPane().add(jLabel);

        //设置显示
        this.setVisible(true);
    }

    private void initinput() {

        JTextField text1 = new JTextField();
        text1.setBounds(loginx + 60, loginy, 140, 29);

        JTextField text2 = new JTextField();
        text2.setBounds(loginx + 60, loginy + 50, 140, 29);

        this.getContentPane().add(text1);
        this.getContentPane().add(text2);
    }

    private void initButton() {

        //登录和注册按钮
        login = new JButton(new ImageIcon("image\\login\\登录按钮.png"));
        login.setBounds(loginx - 30, loginy + 200, 126, 46);
        register.setBounds(loginx + 150, loginy + 200, 126, 46);
        this.getContentPane().add(login);
        this.getContentPane().add(register);

        //显示密码
//        JButton showpassword = new JButton(new ImageIcon("image\\login\\显示密码.png"));
        showpassword.setBounds(loginx + 200, loginy + 50, 18, 29);
        this.getContentPane().add(showpassword);

        //去掉边界
        login.setContentAreaFilled(false);
        login.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.setBorderPainted(false);
        //添加按钮事件
        login.addMouseListener(this);
        register.addMouseListener(this);
        showpassword.addMouseListener(this);
    }

    private void initimage() {

        //输入界面
        JLabel username = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        JLabel password = new JLabel(new ImageIcon("image\\login\\密码.png"));
        username.setBounds(loginx, loginy, 47, 17);
        password.setBounds(loginx, loginy + 50, 32, 17);
        this.getContentPane().add(username);
        this.getContentPane().add(password);




        //加载背景

    }

    private void initFrame() {
        this.setSize(488, 430);
        this.setTitle("拼图 登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(3);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {

            this.dispose();

        } else if (e.getSource() == register) {
            new RegisterJDialog();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == showpassword) {
            showpassword.setIcon(new ImageIcon("image\\login\\显示密码按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == showpassword) {
            showpassword.setIcon(new ImageIcon("image\\login\\显示密码.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        }

    }
}
