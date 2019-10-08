package cn.xycode.day02.demo01;
/**
 * Description:Devise A System Of LogIn
 * Author:Mr.Ma
 * Date:2019-9-20
 * 练习字符串比较 public boolean equals(Object obj);//不区分大小写
 */
import java.util.Scanner;

public class Demo01LogIn {
    public static void main(String[] args) {
        LogIn person = new LogIn();
        System.out.println("====登录测试====");
        System.out.print("输入账号：");
        Scanner scan01 = new Scanner(System.in);
        String id = scan01.next();
        System.out.print("输入密码：");
        Scanner scan02 = new Scanner(System.in);
        String password = scan02.next();
        if (id.equals(person.getId()) && password.equals(person.getPassword()) == true) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
