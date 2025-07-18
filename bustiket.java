

import java.util.Scanner;

public class bustiket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seats[][]= {
				new boolean[5],
				new boolean[3],
				new boolean[2]
		};
		int classChoice,seatNo;
		while(true) {
		System.out.println("Seat availability:");
		for(int i=0;i<seats.length;i++) {
			System.out.print("class"+(i+1)+":");
			for(boolean seat:seats[i]) {
				System.out.print(seat?"[x]":"[]");
			
			}
			System.out.println();
			
		}
		System.out.println("Enter class(1-Economy class,2-buissnes class,3-firstclass,0 to exit)");
		classChoice=sc.nextInt();
		if(classChoice==0) {
			break;
		
		}
		if(classChoice<1||classChoice>3) {
			System.out.println("Invalid choice,please re enter the classChoice");
			continue;
			
		}
		System.out.println("Enter a seat number(1-"+seats[classChoice-1].length+"):");
		seatNo=sc.nextInt();
		
		if(seatNo<1||seatNo>seats[classChoice-1].length) {
			System.out.println("Invalid seat number please re enter");
			continue;
		}
		if(seats[classChoice-1][seatNo-1]) {
			System.out.println("booked");
			
			
		}
		else {
			seats[classChoice-1][seatNo-1]=true;
			
		}
		
		
	}

}
}

    

