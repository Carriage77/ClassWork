package cn.xycode.day07ClassWork.demo03;


import java.util.Scanner;

public class Circle extends Shape {

    @Override
    public void draw() {
                System.out.print("请输入圆的半径：");
                Scanner sc=new Scanner(System.in);
                int r=sc.nextInt();
                for(int y=0; y<=2*r;y+=2){
                    int x=(int)Math.round(r-Math.sqrt(r*r-(r-y)*(r-y)));
                    int l=2*(r-x);
                    for(int i=0;i<=x;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(int j=0;j<=l;j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }

    @Override
    public void erase() {
        System.out.println("清除！");
    }
}




