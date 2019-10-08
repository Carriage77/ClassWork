package cn.xycode.day03.demo01;
/**
 * Description:Return SmallList From BigList
 * Author:Mr.Ma
 * Date:2019-9-22
 * 练习 ArrayList/Random;
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random num = new Random();
        for (int i = 0; i < 10; i++) {
            int n = num.nextInt(100) + 1;
            bigList.add(n);//随机存入1~100之间的数字
        }
        System.out.println("存入的10个数字为：");
        System.out.println(bigList);
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("=====================================");
        int even = smallList.size();
        System.out.print("偶数共有："+even+"个\n分别是：");
        System.out.println(smallList);
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int j = 0; j < bigList.size(); j++) {
            int num = bigList.get(j);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
