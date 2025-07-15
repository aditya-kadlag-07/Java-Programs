import java.util.*;
import java.util.stream.IntStream;
public class Array1 {
public class array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element:");
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];
		System.out.println("Enter the value for array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key:");
		int key=sc.nextInt();
		
		boolean res=IntStream.of(arr).anyMatch(x->x==key);
		System.out.println(res?"found":"not found");
		//liner search and binary search find difference
		//liner search key -90 found
		//write a program to print max and min from array using foreach
		//use advance for loop

	}

}

}
