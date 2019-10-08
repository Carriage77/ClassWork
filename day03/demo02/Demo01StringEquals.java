package cn.xycode.day03.demo02;

/**
 * Description:Exercise 'Equals'
 * Author:Mr.Ma
 * Date:2019-9-24
 * 练习 String类的比较方法：
 * 01. public boolean equals(Object obj)；//严格区分英文大小写
 * 02. public boolean equalsIgnoreCase(String str); //无视英文大小写
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str1));//true
        System.out.println(str1.equals(str3));//false
        System.out.println("Hello".equals(str2));//true

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str3.equalsIgnoreCase(str2));//ture
        System.out.println("Hello".equalsIgnoreCase(str1));//true
    }
}
