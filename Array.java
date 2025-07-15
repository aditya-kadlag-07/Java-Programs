import java.util.*;
public class Array {
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of element:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the value for Element:");
	for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
	}
	System.out.println("value from Array:");
	//normal for loop
	//for(int i=0;i<n;i++);
	//System.out.println(arr[i]);
	//}
	
	//for eachloop
	for(int x:arr) {
		System.out.println(x);
		
	 }
   }
 }
}
