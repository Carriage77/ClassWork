package cn.xycode.day03.demo02;

/**
 * Description:Return SmallList From BigList
 * Author:Mr.Ma
 * Date:2019-9-24
 * 练习 创建String的构造方法;
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 ="World";
        System.out.println("第四个字符串：" + str4);
    }
}
