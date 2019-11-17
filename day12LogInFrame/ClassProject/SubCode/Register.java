package cn.xycode.day12LogInFrame.ClassProject.SubCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: LogInFrameVersion1.1
 * @Description: 注册
 * @author: Mr.Ma
 * @date: 2019/11/16 4:02 下午
 */
public class Register extends JFrame implements ActionListener {
    private JLabel labname;
    private JTextField name;
    private JLabel labpw1;
    private JTextField pw1;
    private JLabel labpw2;
    private JTextField pw2;
    private JButton register;
    private JButton back;

    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;

  public Register(){
      //添加文本
      this.setTitle("注册");
      labname = new JLabel("请输入用户名：");
      labpw1 = new JLabel("请输入密码：");
      labpw2 = new JLabel("请再次输入密码：");
      register = new JButton("注册");
      back = new JButton("返回");

      //设置有限长度
      name = new JTextField(20);
      pw1 = new JTextField(20);
      pw2 = new JTextField(20);

      //设置注册界面
      this.setSize(500, 560);
      this.setDefaultCloseOperation(3);
      this.setLocationRelativeTo(null);
      this.setResizable(false);

      //建立流式布局
      FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 5, 5);
      this.setLayout(fl);

      //设置图片内容
      ImageIcon icon = new ImageIcon("E:\\IdeaProjects\\mycode\\mycode\\pic\\04_login.jpg");
      JLabel labIcon = new JLabel(icon);
      labIcon.setBounds(0, 0, labIcon.getWidth(), labIcon.getHeight());


      //设置字体以及大小
      Font font = new Font("微软雅黑", Font.PLAIN, 15);
      Font font1 = new Font("宋体", Font.PLAIN, 16);
      Font ver = new Font("微软雅黑", Font.PLAIN, 10);

      Dimension dim1 = new Dimension(420, 30);
      Dimension dim2 = new Dimension(150, 100);

      labname.setFont(font);
      labpw1.setFont(font);
      labpw2.setFont(font);
      register.setFont(font1);
      back.setFont(font1);

      name = new JTextField();
      name.setPreferredSize(dim1);
      name.setOpaque(false);

      pw1 = new JTextField();
      pw1.setPreferredSize(dim1);
      pw1.setOpaque(false);

      pw2 = new JTextField();
      pw2.setPreferredSize(dim1);
      pw2.setOpaque(false);

      back.setBackground(new Color(0, 178, 238));
      back.setForeground(Color.white);
      back.setSize(dim2);
      register.setBackground(new Color(0, 178, 238));
      register.setForeground(Color.white);
      register.setSize(dim2);

      jp1 = new JPanel();
      jp2 = new JPanel();
      jp3 = new JPanel();
      jp1.add(labname);
      jp2.add(labpw1);
      jp3.add(labpw2);

      back.addActionListener(this::actionPerformed);
      RegListener rl = new RegListener(name,pw1,pw2,this);
      register.addActionListener(rl);




      //添加组件
//      this.add(labIcon);
      this.add(jp1);
      this.add(name);
      this.add(jp2);
      this.add(pw1);
      this.add(jp3);
      this.add(pw2);
      this.add(register);
      this.add(back);
      this.setVisible(true);// 设置窗体为可见

  }
    /**
     * @Description: 重写监听动作:返回按钮的监听
     * @Param: [actionEvent]
     * @return: cn.xycode.day12LogInFrame.ClassProject.SubCode.Register
     * @Author: Mr.Ma
     * @Date: 2019/11/16 10:30 下午
     */

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      this.dispose();
    }

}
