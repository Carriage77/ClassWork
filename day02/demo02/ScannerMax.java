package cn.xycode.day02.demo02;
/**
 * Description:Get the MaxNum
 * Author:Mr.Ma
 * Date:2019-9-20
 * 练习 Scanner / ArrayList / Random ;
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        System.out.println("==========显示最大值===========");
        System.out.println("1：输入三个数来找最大" + "\t" + "2:自动生成");
        System.out.print("输入数字：");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                showMax01();
                break;
            case 2:
                showMax02();
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }

    /**
     * Data:2019-9-20
     * return:null
     * 输入三个数，找到最大值；
     */
    public static void showMax01() {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        a[0] = sc.nextInt();
        System.out.print("输入第二个数：");
        a[1] = sc.nextInt();
        System.out.print("输入第三个数：");
        a[2] = sc.nextInt();
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最大值是：" + max);
    }

    /**
     * Data:2019-9-20
     * return:null
     * 测试ArrayList生成10个数并显示最大值！
     */
    public static void showMax02() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(random.nextInt(100));
        }
        System.out.println("生成的十个数为：");
        System.out.println(list);
        System.out.println("=====================");
        int max = list.get(0);
        for (int n = 1; n < 10; n++) {
            if (list.get(n) > max) {
                max = list.get(n);
            }
        }
        System.out.println("最大值是：" + max);
    }


}
