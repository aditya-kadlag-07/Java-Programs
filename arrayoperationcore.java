
import java.util.*;
public class arrayoperationcore {
public static void main(String[]args)
{
	
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
		System.out.println("Enter the key to search:");
		int key = sc.nextInt();
		boolean flag=false;
		for(int x:arr)
		{
			if(x==key)
			{
				flag=true;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("key found");
			
		}
		else
		{
			System.out.println("key not found");
			
		}
		break;
	case 2:
		int max;
		max=arr[0];
		for(int x:arr)
		{
			if(max<x)
			{
				max=x;
			}
		}
		System.out.println("max:"+max);
		break;
	case 3:
		int min;
		min=arr[0];
		for(int x:arr)
		{
			if(min>x)
			{
				min=x;
			}
		}
		System.out.println("min:"+min);
		break;
	case 4:
		int sum=0;
		for(int num:arr)
		{
			sum += num;
				
		}
		System.out.println("sum:"+sum);
		break;
		}
	}
}
