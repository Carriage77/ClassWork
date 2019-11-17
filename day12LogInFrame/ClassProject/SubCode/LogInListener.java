package cn.xycode.day12LogInFrame.ClassProject.SubCode;

import cn.xycode.day12LogInFrame.ClassProject.Data.Data;
import cn.xycode.day12LogInFrame.ClassProject.Data.DataDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @program: LogInFrameVersion1.1
 * @Description: 按钮监听
 * @author: Mr.Ma
 * @date: 2019/11/14 10:20 下午
 */
public class LogInListener implements ActionListener {

    private JTextField jt;
    private JPasswordField jp;
    private JFrame login;


    public LogInListener(JTextField jt, JPasswordField jp, JFrame login) {
        this.jt = jt;
        this.jp = jp;
        this.login = login;
    }

    /**
     * @Description: 重写监听动作:登录按钮的监听
     * @Param: [actionEvent]
     * @return: cn.xycode.day12LogInFrame.ClassProject
     * @Author: Mr.Ma
     * @Date: 2019/11/14 10:30 下午
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Dimension dim2 = new Dimension(100, 30);
        Dimension dim3 = new Dimension(300, 30);
        Font font = new Font("宋体", Font.PLAIN, 14);

        Data user = new Data();
        DataDao dataDao = new DataDao();
        user = dataDao.ReadUser(jt.getText());

        JFrame login2 = new JFrame();
        login2.setSize(400, 200);
        login2.setDefaultCloseOperation(3);
        login2.setLocationRelativeTo(null);
        login2.setFont(font);

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        JLabel message = new JLabel();
        JButton close = new JButton("确定");

        message.setText("无用户信息");
        String name =jt.getText();
        String password = jp.getText();

        String contrast1 = user.getName();
        String contrast2 = user.getPassword();

        if (name.equals(contrast1) && password.equals(contrast2)) {
                message.setText("登录成功");

        } else if (name.equals(contrast1) &&  !password.equals(contrast2)) {
            message.setText("密码错误");

        }
        message.setFont(font);
        message.setPreferredSize(dim3);
        jp1.add(message);
        login2.add(jp1, BorderLayout.CENTER);
        close.setFont(font);
        close.setSize(dim3);
        jp2.add(close);
        login2.add(jp2, BorderLayout.SOUTH);
        close.addActionListener(new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent actionEvent) {
                                        login2.dispose();
                                    }
                                }
        );
        login2.setResizable(false);
        login2.setVisible(true);


    }
}

