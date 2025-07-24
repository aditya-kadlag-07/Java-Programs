import java.util.Scanner;
public class todarraysum {
  
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for row and col:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr1[][] = new int[row][col];
       

        System.out.println("enter values for 1st array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();

            }

        }
        System.out.println("enter values for 2nd array:");
        int arr2[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("values from 1st array\n");
      
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("values from 2st array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();
        }

       int subArray[][] = new int[row][col];
        
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                subArray[i][j] = arr1[i][j] - arr2[i][j];  
            }
        }
        System.out.println("Sub of the two arrays:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( subArray[i][j]+" ");  
            }
            System.out.println();  
        }

    }
}

