package test.com;


import java.util.Scanner;
class  PrimeNumber
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	
	
	boolean status= true;
	if((num==0)||(num==1))
	{
		System.out.println("Num is not Prime");
	}
	else
	{
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				System.out.println("Num is not Prime");
				
				status=false;
				
				break;
				
			}
		}
		
	}
	if(status==true)
	{
	   System.out.println("Number is Prime");
	}
	}
}
