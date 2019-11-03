package cn.xycode.day07ClassWork.demo02;

/**
 * @program: book
 * @Description: 继承父类Book属性，构造子类成员方法
 * @author: Mr.Ma
 * @date: 2019/11/3 1:15 下午
 */
public class Dictionary extends Book {

    public Dictionary(int pages, String name) {
        super(pages, name);
    }

    public Dictionary() {
    }

    public void showDictionary(int pages, String name) {
        System.out.println("这是一本《" + name + "》,共<" + pages + ">页");


    }


}
