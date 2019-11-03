package cn.xycode.day07ClassWork.demo03;

import java.util.Scanner;

public class MainPaper {
    public static void main(String[] args) {

        System.out.println("---1:画圆---2.画正方形---");
        System.out.print("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Shape shapeA = new Circle();
                shapeA.draw();
                shapeA.erase();
                break;
            case 2:
                Shape shapeB = new Square();
                shapeB.draw();
                shapeB.erase();
                break;
            default:
                System.out.println("输入错误！");
                break;

        }


    }
}
