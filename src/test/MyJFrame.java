package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyJFrame extends JFrame implements MouseListener{
    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");

    public MyJFrame() {

        initJMenuBar();
        initJframe();


        jb1.setBounds(0, 0, 100, 50);
        jb1.addMouseListener(this);


        jb2.setBounds(300, 0, 100, 50);
        jb2.addMouseListener(this);

        this.getContentPane().add(jb1);
        this.getContentPane().add(jb2);


        this.setVisible(true);
    }

    private void initJMenuBar() {
    }

    private void initJframe() {
        this.setSize(603, 680);
        this.setTitle("测试");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
