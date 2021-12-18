// wap to print Pyramid Pattern example

/*
12345    5       1 to 5
1234     4       1 to 4
123      3       1 to 3
12       2       1 to 2
1        1       1 to 1
*/
package BubbleSort.com;

public class PyramidPattern {
	public static void main(String[] args) {
		
		for(int row=5; row>0; row--)
		{
		for(int col=1; col<=row; col++)
		{
			System.out.print(col);
		}
		
		System.out.println("");
		}
		
		
	}

}
