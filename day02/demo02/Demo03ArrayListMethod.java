package cn.xycode.day02.demo02;

import java.util.ArrayList;

/**
 * Description:Text The Method Of ArrayList
 * Author:Mr.Ma
 * Date:2019-9-20
 * 练习常用的 ArrayList
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        boolean success=list.add("马里奥");
        System.out.println("第一次添加后：");
        System.out.println(list);
        System.out.println("是否添加成功："+success);
        System.out.println("=======================");

        System.out.println("第二次添加后：");
        list.add("塞尔达");
        list.add("林克");
        list.add("皮卡丘");
        System.out.println(list);
        System.out.println("=======================");

        //从集合中获得元素。
        System.out.println("获得第二号元素后：");
        String name = list.get(1);
        System.out.println("第二位是："+name);
        System.out.println("=======================");

        //删除第4号元素。
        System.out.println("删除第四号元素后：");
        list.remove(3);
        System.out.println(list);
        System.out.println("=======================");
        //计算长度。
        int size = list.size();
        System.out.println("集合的长度是："+size);
        //遍历集合
        System.out.print("遍历集合：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }


    }
}
