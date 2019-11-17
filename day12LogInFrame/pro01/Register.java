package cn.xycode.day12LogInFrame.pro01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Register {
        private Frame frame;
        private Label nameTxt;
        private TextField name;
        private Label pw1Txt;
        private TextField pw1;
        private Label pw2Txt;
        private TextField pw2;
        private Button register;
        private Button back;
        private Data data;

        public Register(Data data){
            this.data = data;
            frame = new Frame("注册");
            nameTxt = new Label("请输入用户名：");
            name = new TextField(20);
            pw1Txt = new Label("请输入密码：");
            pw1 = new TextField(20);
            pw2Txt = new Label("请再次输入密码：");
            pw2 = new TextField(20);
            register = new Button("注册");
            back = new Button("返回");
        }

        private void init(){
            Panel centerPanel = new Panel();
            GridLayout grid = new GridLayout(3,2,3,3);
            centerPanel.setLayout(grid);
            centerPanel.add(nameTxt);
            centerPanel.add(name);
            centerPanel.add(pw1Txt);
            centerPanel.add(pw1);
            centerPanel.add(pw2Txt);
            centerPanel.add(pw2);
            Panel southPanel = new Panel();
            southPanel.add(register);
            southPanel.add(back);
            frame.add(centerPanel,BorderLayout.CENTER);
            frame.add(southPanel,BorderLayout.SOUTH);
        }

        private class WindowClose extends WindowAdapter implements ActionListener {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                new Login(data).showMe();
                frame.dispose();
            }
        }

        private class Registering implements ActionListener{
            public void actionPerformed(ActionEvent e){
                Dialog tip = new Dialog(frame,"提示");
                Label cfg;
                Panel panel;
                if(!pw1.getText().equals(pw2.getText())){
                    cfg = new Label("两次密码不相符");
                }
                else if(!data.add(name.getText(),pw1.getText())){
                    cfg = new Label("注册失败，该用户已存在");
                }
                else{
                    cfg = new Label("注册成功");
                }
                panel = new Panel();
                panel.add(cfg);
                tip.add(panel);
                tip.setLocation(350,350);
                tip.pack();
                tip.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        tip.dispose();
                    }
                });
                tip.setVisible(true);
            }
        }

        public void showMe(){
            init();
            frame.pack();
            frame.setResizable(false);
            frame.setLocation(300,300);
            frame.addWindowListener(new WindowClose());
            back.addActionListener(new WindowClose());
            register.addActionListener(new Registering());
            frame.setVisible(true);
        }
    }



