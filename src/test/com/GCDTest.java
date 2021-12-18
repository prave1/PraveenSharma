package test.com;

public class GCDTest {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int gcd=0;
		
		int Lnum=num1;
		if(num1>num2)
		{
			Lnum=num1;
			
		}
		for(int i=1; i<=Lnum; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
				
			}
			System.out.print(gcd);
		}
	}

}
