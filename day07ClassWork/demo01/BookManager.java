package cn.xycode.day07ClassWork.demo01;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Ma
 * @date: 2019/10/30 7:10 下午
 */
public class BookManager {
    public static void main(String[] args) {
        System.out.println("----图书ID------图书名称-------图书页数-------图书定义---");
        //使用构造方法进行构造
        Dictionary dictionary = new Dictionary("INB001", "Java从入门到入土", 390, 8);
        int pages = dictionary.pages;
        display(" " + dictionary.getBookId());
        display(dictionary.getBookName() + " ");
        display(String.valueOf(pages) + "\t\t\t");
        display(String.valueOf(dictionary.getDefinitions()));
        System.out.println("\n");


        //使用构造方法进行构造
        Book book = new Book("INB002", "C语言从入门到放弃", 270);
        display("   " + book.getBookId());
        display(book.getBookName() + "\t");
        display(String.valueOf(book.pages) + "\t\t");
        System.out.print("null");
        System.out.println("\n");


        //使用多态的方式进行构造
        Book bookdictionary = new Dictionary("INB003", "C++从入门到放弃", 298, 8);
        display(" " + bookdictionary.getBookId());
        display(bookdictionary.getBookName() + "\t");
        display(String.valueOf(bookdictionary.pages) + "\t\t");
        System.out.print("null");
    }

    /**
     * @Description: 显示结果
     * @Param: [content]
     * @return: void
     * @Author: Mr.Ma
     * @Date: 2019/10/30 7:24 下午
     */
    public static void display(String content) {
        System.out.print(content + "\t");
    }
}
