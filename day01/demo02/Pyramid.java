package cn.xycode.day01.demo02;

import java.util.Scanner;

/**
 * Description:Build A Digital Pyramid
 * Author:Mr.Ma
 * Date:2019-9-17
 */

public class Pyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入金字塔层数：");
        int n = scan.nextInt();
        printPyramid(n);
    }

    /**
     * Date:2019-9-17
     * return:null
     * @param n
     */

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=  i ; k++) {
                System.out.print(" $");
            }
            System.out.print("\n");

        }
    }
}
