package cn.xycode.day12LogInFrame.pro01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login {
        private Data data;
        private Frame frame;
        private Label nameTxt;
        private Label pwTxt;
        private TextField name;
        private TextField pw;
        private Button login;
        private Button register;

        public Login(Data data){
            this.data = data;
            frame = new Frame("登录");
            nameTxt= new Label("用户名：");
            name = new TextField(20);
            pwTxt = new Label("密码：");
            pw = new TextField(20);
            login = new Button("登录");
            register = new Button("注册");
        }
        private void init(){
            Panel centerPanel = new Panel();
            GridLayout grid = new GridLayout(2,2,3,3);
            centerPanel.setLayout(grid);
            centerPanel.add(nameTxt);
            centerPanel.add(name);
            centerPanel.add(pwTxt);
            centerPanel.add(pw);
            Panel southPanel = new Panel();
            southPanel.add(login);
            southPanel.add(register);
            frame.add(centerPanel,BorderLayout.CENTER);
            frame.add(southPanel,BorderLayout.SOUTH);
        }

        private class WindowClose extends WindowAdapter{
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        private class In implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Dialog dialog = new Dialog(frame,"提示");
                Label cfg = new Label(data.login(name.getText(),pw.getText())) ;
                Panel panel = new Panel();
                panel.add(cfg);
                dialog.add(panel);
                dialog.pack();
                dialog.setLocation(350,350);
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        }
        private class Reg implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Register(data).showMe();
                frame.dispose();
            }
        }

        public void showMe(){
            init();
            frame.setLocation(300,300);
            //调整此窗口的大小，以适合其子组件的首选大小和布局。
            // 如果该窗口和/或其所有者还不可显示，则在计算首选大小之前都将变得可显示。在计算首选大小之后，将会验证该窗口。
            frame.pack();
            frame.setResizable(false);
            frame.addWindowListener(new WindowClose());
            login.addActionListener(new In());
            register.addActionListener(new Reg());
            frame.setVisible(true);
        }
    }







