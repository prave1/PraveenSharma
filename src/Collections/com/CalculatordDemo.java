// java Program Calculators
//------------------------------------
package Collections.com;

import java.util.Scanner;

public class CalculatordDemo {
	
	
public static void main(String args[])
{
	
	int num1, num2; 
	
	Scanner sc= new Scanner(System.in);
   System.out.println("Enter Numbers:");
   num1=sc.nextInt();
   num2=sc.nextInt();
   System.out.println("Entr an Operators to Perform Operations(+,-,*,/)");
   
   char op=sc.next().charAt(0);
   int o=0;
   switch(op)
   {
   case'+':
	   o=num1+num2;
	   
	   break;
	   
   case '-':
	   o=num1-num2;
	   break;
   case '*':
	   o=num1*num2;
	   break;
	   
   case'/':
	   o=num1/num2;
	   
	   break;
	   default:
		   
		   System.out.println("You Have Entered wrong Operators");
   
         break;
         
   }
   
    System.out.println(num1+" "+op+" "+num2+"="+o);
   
   
}
   

}
