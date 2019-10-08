package cn.xycode.day04.demo01;
/**
 * Description:Exercise The Substring
 * Author:Mr.Ma
 * Date:2019-9-24
 * 练习 Substring ：
 * public String substring(int index);
 * public String substring(int begin,int end);   //[begin,end)
 */
public class Demo01Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println("===============");

        String str3 =str1.substring(4,7);
        System.out.println(str3);

    }

}
