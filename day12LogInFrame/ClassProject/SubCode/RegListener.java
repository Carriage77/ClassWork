package cn.xycode.day12LogInFrame.ClassProject.SubCode;

import cn.xycode.day12LogInFrame.ClassProject.Data.Data;
import cn.xycode.day12LogInFrame.ClassProject.Data.DataDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @program: LogInFrameVersion1.1
 * @Description: 注册按钮监听
 * @author: Mr.Ma
 * @date: 2019/11/16 2:50 下午
 */
public class RegListener implements ActionListener {
    private JTextField jt;
    private JTextField pw1;
    private JTextField pw2;
    private JFrame login;

    public RegListener(JTextField jt, JTextField pw1, JTextField pw2, JFrame login) {
        this.jt = jt;
        this.pw1 = pw1;
        this.pw2 = pw2;
        this.login = login;
    }

    /**
     * @Description: 重写监听动作:注册按钮的监听
     * @Param: [actionEvent]
     * @return: cn.xycode.day12LogInFrame.ClassProject
     * @Author: Mr.Ma
     * @Date: 2019/11/16 2:52 下午
     */

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Dimension dim2 = new Dimension(100, 30);
        Dimension dim3 = new Dimension(300, 30);
        Font font = new Font("宋体", Font.PLAIN, 14);

        Data user = new Data();
//        Data test = new Data();
        DataDao dataDao = new DataDao();
        boolean flag = false;

        JFrame login2 = new JFrame();
        login2.setSize(400, 200);
        login2.setDefaultCloseOperation(3);
        login2.setLocationRelativeTo(null);
        login2.setFont(font);

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        JLabel message = new JLabel();
        JButton close = new JButton("确定");

//        test = dataDao.ReadUser(jt.getName());


        message.setText("三项都必须输入!不能留空！");
        if (!pw1.getText().equals(pw2.getText())) {
            message.setText("两次密码不符合");

        } /*else if (test.getName()==null) {
            message.setText("注册失败，该用户已存在");

        }*/else if(jt.getText()!=null&&pw1.getText().equals(pw2.getText())){
            user.setName(jt.getText());
            user.setPassword(pw1.getText());
            try {
                flag = dataDao.SaveUser(user);
            } catch (IOException e) {
                message.setText("注册失败");
                e.printStackTrace();
            }
            if (flag!=false) {
                message.setText("注册成功");
            }
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
