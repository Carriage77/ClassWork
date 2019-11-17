package cn.xycode.day13BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class LoginPanel  extends JPanel {
        public static void main(String[] args) {
            LoginFrame loginFrame =new LoginFrame();
        }

        private Image image;

        public LoginPanel()
        {
            try {
                image= ImageIO.read(new File("E:\\IdeaProjects\\mycode\\mycode\\pic\\login.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        @Override
public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image,0,0,600,400,null);
        }


public static class LoginFrame extends JFrame implements ActionListener,MouseListener {
    private JTextField usernameText;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel appname;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public LoginFrame() {
        this.setSize(600, 400);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        appname =new JLabel("LogInFrame");
        appname.setBounds(225,30,120,35);
        appname.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        appname.setForeground(Color.white);
        this.add(appname);
        usernameLabel = new JLabel("username");
        usernameLabel.setBounds(10, 100, 90, 35);
        usernameLabel.setForeground(Color.white);
        usernameLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        this.add(usernameLabel);

        usernameText = new JTextField();
        usernameText.setBounds(120, 100, 150, 35);
        usernameText.setFont(new Font("微软雅黑",Font.PLAIN,16));
        usernameText.setOpaque(false);
        usernameText.setBorder(null);
        usernameText.addMouseListener(this);
        this.add(usernameText);

        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(10, 150, 90, 35);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        this.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(120, 150, 150, 35);
        passwordText.setOpaque(false);
        passwordText.setBorder(null);
        passwordText.addMouseListener(this);
        this.add(passwordText);

        loginButton = new JButton("Enter");
        loginButton.setFont(new Font("微软雅黑",Font.PLAIN,18));
        loginButton.setBounds(20, 250, 100, 35);
        loginButton.setForeground(Color.white);
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        this.add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("微软雅黑",Font.PLAIN,18));
        cancelButton.setBounds(150, 250, 100, 35);
        cancelButton.setOpaque(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setForeground(Color.white);
        this.add(cancelButton);
        cancelButton.addActionListener(this);
        this.add(new LoginPanel());
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelButton) {
            JOptionPane.showMessageDialog(this, "welcome again");
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==usernameText)
        {
            usernameText.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        }else if(e.getSource()==passwordText)
        {
            passwordText.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        }

    }
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==usernameText)
        {
            usernameText.setBorder(null);
        }else if(e.getSource()==passwordText)
        {
            passwordText.setBorder(null);
        }

    }
}


    }




