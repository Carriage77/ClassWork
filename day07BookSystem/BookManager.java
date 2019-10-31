package cn.xycode.day07BookSystem;


import java.util.Scanner;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Ma
 * @date: 2019/10/30 7:10 下午
 */
public class BookManager {
    public static void main(String[] args){
        System.out.println("-----------图书系统-----------");
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        Book book = new Book();
        book.setBookName(n);

        Dictionary dictionary = new Dictionary("INB001","jams",90);
        int pages = dictionary.pages;
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        Book book = new Book("INB002","James",70);
        display(book.getBookId());
        Book bookdictionary = new Dictionary("INB003","Toms",98,8);
        display(bookdictionary.getBookId());


    }

    /**
     * @Description: 显示结果
     * @Param: [content]
     * @return: void
     * @Author: Mr.Ma
     * @Date: 2019/10/30 7:24 下午
     */
    public static void display(String content){
        System.out.println(content);
    }
}
