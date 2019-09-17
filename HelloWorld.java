public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello");
		world();
		result();
	}
	public static void world(){
		System.out.println("world");
	} 
	public static int result(){
		int a=0;
		for(int n=0;n<=100;n++){
			a=a+n;
		}
	System.out.println(a);
	return 0;
	}
	
}