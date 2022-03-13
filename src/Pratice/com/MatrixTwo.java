package Pratice.com;

/**
  Enter the row and Matrix:
3
4
Enter the row and Matrix:
1 2 3 4
4 3 2 11
1 2 3 4
11
x Found at location(1,3)

 */

import java.util.Scanner;

public class MatrixTwo {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row and Matrix:");
		int row = sc.nextInt();
         int col = sc.nextInt();
         
         System.out.println("Enter the row and Matrix:");
         
         //Bubble Sorting
         //time complexity=o(n^2)
         int [][]numbers= new int[row][col];
         for(int i=0; i<row; i++)
         {
        	 for(int j=0; j<col; j++)
        	 {
        		 numbers[i][j]=sc.nextInt();
        		 
        	 }
         }
          int x = sc.nextInt();
          for(int i=0; i<row; i++)
          {
        	  for(int j=0; j<col; j++)
        	  {
        		  // compare with x
        		  if(numbers[i][j]==x)
        		  {
        			  System.out.println("x Found at location("+i+","+j+")");
        		  }
        	  }
          }
         
         // Ouput
         /*
         for(int i=0; i<row; i++)
         {
        	 for(int j=0; j<col; j++)
        	 {
        		 System.out.print(numbers[i][j]+" ");
        	 }
        	System.out.println();
         }
         */
	}

}
