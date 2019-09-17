/**
 * Description:Build A Digital Pyramid
 * Author:	Carriage
 * Date:	2019-9-17
 */
import java.util.Scanner;
 
public class Pyramid {
/**
 * Description:Build A Digital Pyramid
 * Param:	[i,j,k,n]
 * return:	[null]
 * Date:	2019-9-17
 */
 public static void main(String[] args) 
 {
  int i,j,k,n;	//i控制金字塔的层数高度；j控制金字塔的形状；k控制金字塔内容；n用于获取用户输出层数
  Scanner scanner=new Scanner(System.in);
  System.out.print("请输入金字塔层数：");
  n=scanner.nextInt();
  for(i=1;i<=n;i++)
  {
   for(j=i;j<=n-1;j++) {
	   System.out.print("  ");
   }	  
   for(k=1;k<=2*i-1;k++) {
	   System.out.printf(" $");
   }   
   System.out.printf("\n");//换行
  }
 }
}

