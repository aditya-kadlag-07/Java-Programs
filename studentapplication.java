   
import java.util.Scanner;
public class studentapplication {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Roll number :");
		int rollno=sc.nextInt();
		
		System.out.println("Enter Student Roll name :");
		String name=sc.next();
		
		System.out.println("Enter student mark for three Subject:");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		
		int total=sub1+sub2+sub3;
		float perct=total/3;
		
		 	System.out.print(rollno);
		 	System.out.println("\n\t|\tName \t\t|\t %s\t\t|");
		 	System.out.println("\n\t|\tMath \t\t|\t %d\t\t\t|");
		 	System.out.println(sub2);
		 	System.out.println(sub3);
		 	System.out.println(total);
		 	System.out.println(perct);
		 	System.out.println("\n\t-------------------------------------------------");
		    


	}

}


