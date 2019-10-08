package cn.xycode.day02.demo02;

import java.util.ArrayList;

/**
 * Description:Devise A Class Of Student By ArrayList
 * Author:Mr.Ma
 * Date:2019-9-20
 * 练习 private与ArrayList;
 */
public class Demo04ArrayListStudent {
    /**
     * Date:2019-9-20
     * return null
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("迪丽热巴", 20);
        Student two = new Student("古力娜扎", 21);
        Student three = new Student("玛尔扎哈", 22);
        Student four = new Student("泷泽萝拉", 23);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        System.out.println("========学生成员名单=======");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }

    }

}
