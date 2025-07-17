import java.util.Arrays;
import java.util.Scanner;

public class binarysort {
   

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element:");
		int key=sc.nextInt();
		
		
		int arr[]=new int[key];
		System.out.println("Enter the value for array:");
		for(int i=0;i<key;i++) {
			arr[i]=sc.nextInt();
			
			int result=Arrays.binarySearch(arr,key);
			System.out.println(result>=key?"key found":"key not found");
			

		}

	}
}

