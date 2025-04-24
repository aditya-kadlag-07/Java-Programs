
import java.util.Scanner;
public class Add {

	public static void main(String[] args)
	{
		int num1,num2,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number :");
	    num1=sc.nextInt();
		num2=sc.nextInt();
		add=num1+num2;
		System.out.println("Add of "+num1+" and "+num2+" is : "+add);

	}

}
