package cn.xycode.day13BorderLayout;

import javax.swing.*;
import java.awt.*;


    public class LogInFrame03 extends JFrame{
        JPanel mb;
        JLabel lb,lb1,lb2,lb3;
        JButton bt;
        JTextField username;
        JPasswordField password;
        JCheckBox select1,select2;
        public LogInFrame03() {
            lb=new JLabel(new ImageIcon("E:\\IdeaProjects\\mycode\\mycode\\pic\\qimg.png"));//上部分图片
            mb=new JPanel();
            lb3=new JLabel(new ImageIcon("E:\\IdeaProjects\\mycode\\mycode\\pic\\head.png"));//qq头像部分
            username =new JTextField(20);
            password=new JPasswordField(20);
            lb1=new JLabel("<html><a >注册账号</ a></html>");
            lb1.setForeground(new Color(28,134,238));
            lb1.setFont(new Font("宋体",Font.PLAIN,16));
            lb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lb2=new JLabel("<html><a >找回密码</ a></html>");
            lb2.setForeground(new Color(28,134,238));
            lb2.setFont(new Font("宋体",Font.PLAIN,16));
            lb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            select1=new JCheckBox("记住密码");
            select1.setFont(new Font("宋体",Font.PLAIN,15));
            select1.setBackground(Color.WHITE);
            select2=new JCheckBox("自动登陆");
            select2.setFont(new Font("宋体",Font.PLAIN,15));
            select2.setBackground(new Color(255,250,250));
            bt=new JButton("登 录");
//将组建添加到面板当中
            mb.add(lb2);mb.add(lb1);mb.add(lb3);mb.add(select1);mb.add(select2);
            mb.add(bt);mb.add(username);mb.add(password);
            mb.setSize(540,190);
//将面板的布局设为null，然后自定义布局
            mb.setLayout(null);
            mb.setBackground(Color.white);
            lb3.setBounds(43, 8, 100, 100);
            username.setBounds(160, 14, 250, 37);
            username.setFont(new Font("宋体",Font.PLAIN,16));
            password.setBounds(160,48, 250, 37);
            password.setFont(new Font("宋体",Font.PLAIN,16));
            lb1.setBounds(420,10,80,34);
            lb2.setBounds(420,50,80,34);
            select1.setBounds(160,90,120,20);
            select2.setBounds(320,90,120,20);
            bt.setBounds(160,130,250,37);
            bt.setFont(new Font("宋体",Font.PLAIN,16));
            bt.setBackground(new Color(0,178,238));
            bt.setForeground(Color.white);
            this.setUndecorated(true);//消除边框
            this.add(lb, BorderLayout.NORTH);
            this.add(mb,BorderLayout.CENTER);
            this.setSize(540, 440);
            this.setTitle("用户登录");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocation(620, 280);
            this.setResizable(false);
            this.setVisible(true);

        }
        public static void main(String[] args) {
            LogInFrame03 login =new LogInFrame03();
        }



}
