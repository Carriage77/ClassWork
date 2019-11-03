package cn.xycode.day07ClassWork.demo02;

/**
 * @program: book
 * @Description: 定义图书属性为父类
 * @author: Mr.Ma
 * @date: 2019/11/3 1:10 下午
 */
public class Book {
    private int pages;
    private String name;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int pages, String name) {
        this.pages = pages;
        this.name = name;
    }

    public Book() {
    }
}
