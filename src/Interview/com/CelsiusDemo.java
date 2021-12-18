// Write a java Program to convert Fahrenheit to celsius???
package Interview.com;

import java.util.Scanner;

public class CelsiusDemo {
	public static void main(String[] args) {
		float temp;
		
		System.out.println("Enter the temperature to conver in to celsius:");
		
		Scanner sc= new Scanner(System.in);
		temp=sc.nextFloat();
		temp=((temp-32)*5)/9;
		
		System.out.println("temp in celsius="+temp);
		
		
		
	}

}
