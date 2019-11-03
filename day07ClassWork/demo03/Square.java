package cn.xycode.day07ClassWork.demo03;


import java.util.Scanner;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.print("请输入正方形的边长：");
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        for (int i = 1; i <= r; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int num =1 ;num <=r-2; num++){
            for (int i = 1; i <= r; i++) {
                if (i == 1){
                    System.out.print("*");
                }
                else if (i==r){
                    System.out.print("*");
                    System.out.println();
                }
                else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 1; i <= r; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    @Override
    public void erase() {
        System.out.println("清除！");
    }
}
