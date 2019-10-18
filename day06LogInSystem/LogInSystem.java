package cn.xycode.day06LogInSystem;


import cn.xycode.day06LogInSystem.result.Result;
import cn.xycode.day06LogInSystem.subCode.User;
import cn.xycode.day06LogInSystem.subCode.UserService;
import cn.xycode.day06LogInSystem.subCode.UserServiceImpl;

import java.util.Scanner;

/**
 * @program: UserDao
 * @Description: implement user service
 * @author: Mr.Ma
 * @date: 2019/10/17 8:05 下午
 */
public class LogInSystem {
    static Scanner sc = new Scanner(System.in);
    static User user = new User();
    static UserService userDao = new UserServiceImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----登录系统-----");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("请选择：");
            String m = sc.nextLine();
            switch (m) {
                case "1":
                    denglu();
                    break;
                case "2":
                    zhuce();
                    break;
                case "3":
                    changePassword();
                    break;
                case "4":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                default:
                    System.out.println("输入错误，请重新输入！");

            }

        }
    }

    public static void changePassword() {
        System.out.println("----------忘记密码------------");
        System.out.print("输入需要找回的账号：");
        String b = sc.nextLine();
        Result resultForget = userDao.ForgetData(b);
        System.out.println(resultForget.getResultMessage());
    }


    public static void denglu() {
        System.out.println("----------登录------------");
        System.out.print("账号：");
        String n = sc.nextLine();
        System.out.print("密码：");
        String p = sc.nextLine();
        user.setName(n);
        user.setPassword(p);
        Result resultLogin = userDao.Login(user);
        System.out.println(resultLogin.getResultMessage());
    }

    public static void zhuce() {
        System.out.println("----------注册------------");
        System.out.print("输入注册账号：");
        String name = sc.nextLine();
        System.out.print("输入注册密码：");
        String password = sc.nextLine();
        User user = new User(name, password);
        Result resultRegister = userDao.register(user);
        System.out.println(resultRegister.getResultMessage());
    }


}
