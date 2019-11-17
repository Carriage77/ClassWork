package cn.xycode.day12LogInFrame.ClassProject.SubCode;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: LogInFrameVersion1.1
 * @Description: 练习（学习）设计登录界面(流式布局FlowLayout)
 * @author: Mr.Ma
 * @date: 2019/11/14 9:20 下午
 */

public class InitUI extends JFrame implements ActionListener {
    private JLabel labName;
    private JTextField textName;
    private JLabel labPass;
    private JPasswordField textword;
    private JButton loginB;
    private Dimension dim1;
    private Dimension dim2;
    private JButton RegisterB;
    private JButton ForgetB;
    private JLabel version;
    private ImageIcon icon;
    private JLabel labIcon;
    final static String versionText = "v1.1 author:Mr.Ma";


    public InitUI() {

        this.setTitle("登录系统");//设置窗体标题
        this.setSize(500, 560);//设置界面大小，单位是像素
        this.setDefaultCloseOperation(3);//设置窗体的关闭操作；3表示关闭窗体退出程序
        this.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置0
        this.setResizable(false);//// 设置禁止调整窗体大小

        //建立流式布局
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 5, 5);
        this.setLayout(fl);

        //设置图片内容
        icon = new ImageIcon("E:\\IdeaProjects\\mycode\\pic\\04_login.jpg");
        labIcon = new JLabel(icon);
        labIcon.setBounds(0, 0, labIcon.getWidth(), labIcon.getHeight());


        //设置字体
        Font font = new Font("微软雅黑", Font.PLAIN, 15);
        Font font1 = new Font("宋体", Font.PLAIN, 16);
        Font ver = new Font("微软雅黑", Font.PLAIN, 10);

        dim1 = new Dimension(420, 30);
        dim2 = new Dimension(150, 100);

        //账号
        labName = new JLabel("账号");
        labName.setFont(font);

        //设计容器用于读取账号内容
        textName = new JTextField();
        textName.setPreferredSize(dim1);
        textName.setOpaque(false);

        //密码
        labPass = new JLabel("密码");
        labPass.setFont(font);

        //设置容器用于读取密码内容
        textword = new JPasswordField();
        textword.setPreferredSize(dim1);
        textword.setOpaque(false);


        //设置登录按钮
        loginB = new JButton();//LoginButton
        loginB.setText("登录");
        loginB.setFont(font1);
        loginB.setBackground(new Color(0, 178, 238));
        loginB.setForeground(Color.white);
        loginB.setSize(dim2);


        //设置注册按钮
        RegisterB = new JButton();
        RegisterB.setText("注册");
        RegisterB.setFont(font1);
        RegisterB.setBackground(new Color(0, 178, 238));
        RegisterB.setForeground(Color.white);
        RegisterB.setSize(dim2);

        //设置注册按钮
        ForgetB = new JButton();
        ForgetB.setText("忘记密码");
        ForgetB.setFont(font1);
        ForgetB.setBackground(new Color(0, 178, 238));
        ForgetB.setForeground(Color.white);
        ForgetB.setSize(dim2);

        //添加版本信息
        version = new JLabel();
        version.setText(versionText);
        version.setFont(ver);

        //排列组件
        this.add(labIcon);
        this.add(labName);
        this.add(textName);
        this.add(labPass);
        this.add(textword);
        this.add(RegisterB);
        this.add(loginB);
//        frame.add(ForgetB);
        this.add(version);
        this.setVisible(true);// 设置窗体为可见

        LogInListener ll = new LogInListener(textName, textword, this);
        loginB.addActionListener(ll);

        RegisterB.addActionListener(this::actionPerformed);


    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new Register();
    }
}
