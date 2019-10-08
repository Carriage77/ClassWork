package cn.xycode.day04.demo01;
/**
 * Description:Exercise String Convert
 * Author:Mr.Ma
 * Date:2019-9-24
 * 练习 字符串转换 ：
 * public char[] toCharArray()；将字符串拆分成字符数组作为返回值
 * public byte[] getBytes()；获得当前字符串底层的字节数组
 * public String replace (CharSequence oldString,CharSequence newString)；
 * CharSequence ：可以接受字符类型。
 */
public class Demo02StringConvert {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("================");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("================");

        String replace = "会不会玩啊！你大爷的！".replace("你大爷的", "******");
        System.out.println(replace);
    }

}
