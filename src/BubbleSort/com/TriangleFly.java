//wap to print floyds triangle
package BubbleSort.com;

import java.util.Scanner;

public class TriangleFly {
	
	public static void main(String[] args) {
		int n,c,d,num=1;
		System.out.println("Enter the Numbers");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();               // 4
		
	  System.out.println("--------Floy Triangle-------------:");
      
	     for( c=1; c<=n; c++)             //c+1
	     {
	    	 
	    for(d=1; d<=c; d++)
	    {
	    	System.out.print(num+" ");        //1
	    	                                  //2
	    	
	  num++;
	    }
	    
	    System.out.println(" ");                // new Line
	     }
		
	}

}
