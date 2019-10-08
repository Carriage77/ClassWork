package cn.xycode.day04.demo02;
/**
 * Description:字符串倒序排列
 * Author:Mr.Ma
 * Date:2019-9-24
 */

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "dihwijeijaoijiad48642";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");
        }


    }
}
