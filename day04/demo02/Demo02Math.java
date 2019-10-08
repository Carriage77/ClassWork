package cn.xycode.day04.demo02;

/**
 * public static double abs(double num)；//取绝对值
 * public static double ceil(double num)；//向上取整
 * public static double floor(double num)；//向下取整
 * public static long round(double num)；//四舍五入
 */
public class Demo02Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-3.22));//3.22

        System.out.println(Math.ceil(3.01));//4.0
        System.out.println(Math.ceil(3.5));//4.0
        System.out.println(Math.floor(3.5));//3.0
        System.out.println(Math.round(3.1));//3
        System.out.println(Math.round(3.5));//4
        System.out.println(Math.PI);

    }
}
