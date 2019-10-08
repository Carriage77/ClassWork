package cn.xycode.day05.demo01;

public class Son extends Father {
        int num =10;
        public void method(){
            int num =20;
            System.out.println(this.num);
            System.out.println(num);
            System.out.println(super.num);

        }



}
