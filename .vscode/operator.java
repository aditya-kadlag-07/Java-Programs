
import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		//condition?task1:task2;
		//task--value,variable,name,another condition
		//WAP to print max between 2 num
		Scanner sc=new Scanner(System.in);
		//max of two number;
		//System.out.println("Enter two numbers:");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//int max=a>b?a:b;
		//System.out.println("max:"+max);
		
		//max of three number
		//System.out.println("Enter three numbers:");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//int c=sc.nextInt();
		//int max = (a > b) 
               // ? (a > c ? a : c) 
               // : (b > c ? b : c);
		//System.out.println("max:"+max);
		
		
		//max of five numbers
		System.out.println("Enter five numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int max = (a > b) 
                ? (a > c ? a : c) 
                : (b > c ? b : c);
				
		System.out.println("max:"+max);
	}

}




