/**
 * Description:Build A Multiplication Table
 * Author:	Carriage
 * Date:	2019-9-17
 */
public class MultiTable {
/**
 * Description:Build A Digital Pyramid
 * Param:	[i,j]
 * return:	[null]
 * Date:	2019-9-17
 */			
	public static void main(String[] args) {
		int i,j; 
		for(i=1;i<=9;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j));
				System.out.print("\t");
			}
			System.out.print("\n");			
		}					
	}
}