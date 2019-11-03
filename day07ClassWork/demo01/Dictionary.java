package cn.xycode.day07ClassWork.demo01;

/**
 * @program: classprogram
 * @Description: 继承父类Book
 * @author: Mr.Ma
 * @date: 2019/10/30 6:20 下午
 */
public class Dictionary extends Book {
    private int definitions;

    public Dictionary(int definitions) {
        this.definitions = definitions;
    }

    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }


    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
