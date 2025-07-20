import java.util.*;
public class MarkList {

	public static void main(String[] args) {
		//System.out.println("10"+10);
		//System.out.println("10"+2.0);
		//System.out.println("Aditya"+2.0);
		//System.out.println("true"+2);
		//System.out.println(1+1+12.23+'a'+false+"hello"+12+'a'+true);
		//System.out.println(true+false);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String stdname=sc.next();
		System.out.println("Enter student roll no:");
		int stdroll=sc.nextInt();
		System.out.println("Enter student marks S1:");
		float S1=sc.nextFloat();
		System.out.println("Enter student marks S2:");
		float S2=sc.nextFloat();
		System.out.println("Enter student marks S3:");
		float S3=sc.nextFloat();
		System.out.println("Enter student marks S4:");
		float S4=sc.nextFloat();
		System.out.println("Enter student marks S5:");
		float S5=sc.nextFloat();
		
		float totalmark=S1+S2+S3+S4+S5;
		float Percentage=(totalmark/5);
		
		System.out.println("Student roll no is:"+stdroll);
		System.out.println("Student name is:"+stdname);
		System.out.println("Student percentage is:"+Percentage);
		
		
	}

}


