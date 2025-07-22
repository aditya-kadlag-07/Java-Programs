

import java.util.Scanner;

public class productapplication {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter product id:");
		int prodid=sc.nextInt();
		System.out.println("Enetr product name:");
		String prodname=sc.next();
		
		System.out.println("Enter product QTY:");
		int qty=sc.nextInt();
		
		int price = 0;
		int total=price*qty;
		float cgst=total*0.06f;
		float sgst=total*0.06f;
		float finalbill=total+cgst+sgst;
		
		System.out.println("\t|\tProduct ID \t|\t "+prodid);
		System.out.println("\t|\tProduct name \t|\t "+prodid);
		System.out.println("\t|\tProduct price \t|\t "+prodid);
		System.out.println("\t|\tProduct Qty \t|\t "+prodid);
		System.out.println("\t|\tProduct Bill \t|\t "+prodid);
		System.out.println("\t|\tProduct cgst \t|\t "+prodid);
		System.out.println("\t|\tProduct sgst \t|\t "+prodid);
		System.out.println("\t|\tProduct Total \t|\t "+prodid);
		
		
	}

}
 
    

