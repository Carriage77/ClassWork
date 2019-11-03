package cn.xycode.day07ClassWork.demo02;

/**
 * @program: book
 * @Description: 展示效果
 * @author: Mr.Ma
 * @date: 2019/11/3 1:20 下午
 */
public class Main {
    public static void main(String[] args) {
        //多态写法
        Book book = new Dictionary();
        book.setName("葵花宝典");
        book.setPages(70);
        System.out.println("这是一本《" + book.getName() + "》,共<" + book.getPages() + ">页");
        System.out.println("===========================");//华丽分割线

        //构造方法，子类调用
        Dictionary dictionary = new Dictionary(1877, "汉语词典");
        dictionary.showDictionary(dictionary.getPages(), dictionary.getName());

    }


}
