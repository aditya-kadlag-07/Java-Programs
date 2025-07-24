import java.util.Scanner;
public class trianglearea {

	public static void main(String[] args) {
		float base,height,trianglearea;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base and height of triangle :");
		base=sc.nextFloat();
		height=sc.nextFloat();
		
		trianglearea=0.5f*base*height;
		System.out.println("Area of triangle is :" +trianglearea);

	}

}


