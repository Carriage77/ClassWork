package cn.xycode.day01.demo02;

/**
 * Description:Build A MultiTable
 * Author:Mr.Ma
 * Date:2019-9-17
 */

public class MultiTable {
    public static void main(String[] args) {
        createTable();
    }

    /**
     * Date:2019-9-17
     * return:null
     * @param null
     */
    public static void createTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

}
