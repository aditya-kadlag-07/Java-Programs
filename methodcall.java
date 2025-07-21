public class methodcall {
  
	private static int demo(int a) {
		//called
		System.out.println(a+"demo method");
		return a*2;
		
	}
public static void main(String[] args) {
		
	int b= demo(5);//mcs //calling mt
	System.out.println("main method");
	System.out.println(demo(8));
	System.out.println(++b);
	}
}


