

import java.util.Scanner;

public class circlearea {

	public static void main(String[] args) {
		float radius,circlearea;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle :");
		radius=sc.nextFloat();
		
		circlearea=3.14f*radius*radius;
		System.out.println("Area of circle is :" +circlearea);

	}

}


