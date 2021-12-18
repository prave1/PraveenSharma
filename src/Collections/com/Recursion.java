package Collections.com;

public class Recursion {
	
		static void recursion(int num)
		{
			if(num!=0)
			{
				System.out.println(num);
				
				num--;
				recursion(num);
				System.out.println(num);
			}
		}
		
		
		public static void main(String[] args) {
			
		
			recursion(9);
	}

}
