

import java.util.Scanner;

public class tooDarray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for first array rows and columns:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Enter value for arraya:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
		System.out.print(arr[i][j]);
		
		
		
		}
		System.out.println();
					
		}
		System.out.println("Enter value for second array rows and columns:");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int arr1[][]= new int[row1][col1];
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
		
int sumArray[][] = new int[row][col];
        
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumArray[i][j] = arr[i][j] + arr1[i][j];  
            }
        }
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( sumArray[i][j]);  
            }
            System.out.println();  
        }

		
	}

}


	


