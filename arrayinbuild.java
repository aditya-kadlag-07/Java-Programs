import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class arrayinbuild {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of element:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		
		System.out.println("Enter the value for array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("1.Linear search\n2.max\n3.min\n4.sum\n5.avg");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Values of arra:");
			System.out.println("Enter the key to search:");
			int key = sc.nextInt();
			
				boolean res= IntStream.of(arr).anyMatch(x->x==key);
				System.out.println(res?"found":"not found");
				
			break;
		case 2:
			int max=Arrays.stream(arr).max().getAsInt();
			System.out.println("max:"+max);
			break;
		case 3:
			int min=Arrays.stream(arr).min().getAsInt();
			System.out.println("min:"+min);
			break;
		case 4:
			int sum=Arrays.stream(arr).sum();
			System.out.println("sum:"+sum);
			break;
		case 5:
			double avg=Arrays.stream(arr).average().getAsDouble();
			System.out.println("avg:"+avg);
			break;
			default:
			System.out.println("invalid choice");
			
			
			}
		}

}
