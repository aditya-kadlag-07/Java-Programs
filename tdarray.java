
import java.util.Scanner;

public class tdarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for rows and columns:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Enter value for arraya:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
		System.out.print(arr[i][j]);
		
		
		
		}
		System.out.println();
					
		}
		
	}

}


