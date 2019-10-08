package cn.xycode.day03.demo02;

/**
 * Description:Get the Length Of String
 * Author:Mr.Ma
 * Date:2019-9-22
 * 练习 String 获取的方法：
 * public int length()；//获取字符串长度
 * public String concat(String str)；//拼接字符串
 * public char charAt(int index)；//获取指定位置单个字符
 * public int indexOf(String str)；//查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */

public class Demo01StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "ashdahdiqwoejqoehqaksdl".length();
        System.out.println("字符串长度为：" + length);
        System.out.println("===========================");

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println("字符串为：" + str3);
        System.out.println("===========================");

        //获取指定位置单个字符
        char ch = str1.charAt(0);
        System.out.println("获得的字符为：" + ch);
        System.out.println("===========================");

        //查找索引位置
        int index01 = str3.indexOf("llo");
        int index02 = str3.indexOf("ddd");
        System.out.println("字符串：" + str3 + "中\"llo\"的索引值是" + index01);
        System.out.println("字符串：" + str3 + "中\"ddd\"的索引值是" + index02);

    }

}
