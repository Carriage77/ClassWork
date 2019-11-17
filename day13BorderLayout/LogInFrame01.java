package cn.xycode.day13BorderLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @program: LogInFrame
 * @Description: 练习（学习）设计登录界面(流式布局FlowLayout)
 * @author: Mr.Ma
 * @date: 2019/11/5 9:10 下午
 */

public class LogInFrame01 {

    public static void main(String[] args) {
        //实例化LogIn类对象，调用初始化界面的方法。
        LogInFrame01 login = new LogInFrame01();
        login.initUI();
    }


    /**
     * @Description: 定义初始化登录界面
     * @Param: [null]
     * @return: [null]
     * @Author: Mr.Ma
     * @Date: 2019/11/5 9:13 下午
     */
    public void initUI(){
        //实例化JFrame类对象
        JFrame frame = new JFrame();
        //设置界面对象属性值：标题、大小、显示位置、关闭操作、布局、禁止调整大小、可见等。
        frame.setTitle("登录系统");//设置窗体标题
        frame.setSize(500,560);//设置界面大小，单位是像素
        frame.setDefaultCloseOperation(3);//设置窗体的关闭操作；3表示关闭窗体退出程序
        frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置0
        frame.setResizable(false);//// 设置禁止调整窗体大小

        // 实例化FlowLayout流式布局类的对象，指定对齐方式为居中对齐，组件之间的间隔为5个像素
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 5, 5);
//        BorderLayout fl = new BorderLayout();
        // 实例化流式布局类的对象
        frame.setLayout(fl);

        // 实例化元素组件对象，将元素组件对象添加到窗体上（组件添加要在窗体可见之前完成）。
        // 实例化ImageIcon图标类的对象，该对象加载磁盘上的图片文件到内存中，这里的路径要用两个\
//        ImageIcon icon = new ImageIcon("E:\\IdeaProjects\\mycode\\mycode\\pic\\04_login.jpg");
        ImageIcon icon = new ImageIcon("E:\\IdeaProjects\\mycode\\mycode\\pic\\04_login.jpg");
        // 用标签来接收图片，实例化JLabel标签对象，该对象显示icon图标
        JLabel labIcon = new JLabel(icon);
//        labIcon.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        //设置标签大小
//        Dimension dim = new Dimension(400,350);//设置除顶级容器组件其他组件的大小
        labIcon.setBounds(0,0,labIcon.getWidth(),labIcon.getHeight());
//        frame.getLayeredPane().add(labIcon,new Integer(Integer.MIN_VALUE));
//        JPanel contentPanel = (JPanel)frame.getContentPane();
        //设置第一层面板为透明
//        contentPanel.setOpaque(false);
        frame.add(labIcon);

//        labIcon.setPreferredSize(dim);
        // 将labIcon标签添加到窗体上

//        frame.getLayeredPane().add(labIcon,new Integer(Integer.MIN_VALUE));

        // 实例化JLabel标签对象，该对象显示"账号："
        Font font = new Font("微软雅黑", Font.PLAIN, 15);
        JLabel labName = new JLabel("账号");
        labName.setFont(font);
        labName.setBorder(null);
        // 将textName标签添加到窗体上
        frame.add(labName);

        // 实例化JTextField标签对象
        JTextField textName = new JTextField();
        Dimension dim1 = new Dimension(420,30);
        //textName.setSize(dim);//setSize这方法只对顶级容器有效，其他组件使用无效。
        textName.setPreferredSize(dim1);
        textName.setOpaque(false);
        // 将textName标签添加到窗体上
        frame.add(textName);

        //实例化JLabel标签对象，该对象显示"密码："
        JLabel labPass = new JLabel("密码");
        labPass.setFont(font);
        //将labpass标签添加到窗体上
        frame.add(labPass);

        //添加textword到窗体上

        //实例化JPasswordField
        JPasswordField textword = new JPasswordField();
        textword.setPreferredSize(dim1);//设置组件大小
        textword.setOpaque(false);
        frame.add(textword);

        //实例化JButton组件
        JButton button = new JButton();
        Dimension dim2 = new Dimension(150,100);
        //设置按钮的显示内容
        button.setText("登录");
        button.setFont(new Font("宋体",Font.PLAIN,16));
        button.setBackground(new Color(0,178,238));
        button.setForeground(Color.white);
        //设置按钮的大小
        button.setSize(dim2);
        frame.add(button);


        //frame.setUndecorated(true);
        frame.setVisible(true);// 设置窗体为可见





    }




}
