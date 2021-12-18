 package Collections.com;

import java.util.Scanner;

public class MatricDemo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int r,c;
		System.out.println("Enter the Numbers of rows in Matrix");
		r=sc.nextInt();
		System.out.println("Enter the Numbers of Colums in Matrix");
		
		c=sc.nextInt();
		int matrix[][]= new int[r][c];
		
		System.out.println("Enter the elements of the Matrix");
		
		for(int i=0; i<r; i++)
		{
			
			for(int j=0; j<c; j++)
			{
			
				matrix[i][j]=sc.nextInt();  //0,0= 1 0, 1=2
				
			}
		}
		System.out.println("Displaying the elements of the Matrix:");
		for(int i=0; i<r; i++)   // i=0;
		{
			
			for(int j=0; j<c; j++)   //j=0;
			{
				System.out.print(matrix[i][j]+ "  ");  // matrix[0,0]
			}
			
			
			System.out.println();   // matrix[0,0]
		}
		
		
		
	}

}
