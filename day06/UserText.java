package cn.xycode.day06;

import java.util.Scanner;

public class UserText {
    static Scanner sc =new Scanner(System.in);
    static UserDao userDao=new UserDaoImpl();


    public static void main(String[] args) {
        while (true){
            System.out.println("----登录系统-----");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("请选择：");
            String m =sc.nextLine();
            switch (m){
                case "1":denglu(); break;
                case "2":zhuce();break;
                case "3":
                    System.out.println("谢谢使用");
                    break;
                default:System.exit(0);

            }

        }
    }
    public static void denglu(){
        System.out.println("-----登录------");
        System.out.println("id");
        String n =sc.nextLine();
        System.out.println("password");
        String p =sc.nextLine();
        boolean flag =userDao.isLogin(n,p);
        if(flag){
            System.out.println("登录成功");

        }else System.out.println("登录失败");

    }
    public static void zhuce(){
        System.out.println("注册");
        System.out.println("id");
        String name = sc.nextLine();
        System.out.println("password");
        String password = sc.nextLine();
        User user=new User();
        user.setName(name);
        user.setPasswork(password);
        userDao.register(user);
        System.out.println("注册成功");

    }

}
