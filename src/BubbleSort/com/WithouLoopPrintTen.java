//Wap to print numbers in java up to 10 with out using Loops
package BubbleSort.com;

public class WithouLoopPrintTen {
	public static void main(String[] args) {
		
		printNumbers(1);
	}
	
	public static void printNumbers(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			printNumbers(n+1);
		}
	}

}
