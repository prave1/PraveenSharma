package BubbleSort.com;

public class UpperCaseTest {
	
	public static void main(String[] args) {
		
		String s="india is great Country";
		
		for(int i=0; i<s.length(); i++)
		{
			
			if(Character.isUpperCase(s.charAt(i)))
			{
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}
			else
			{
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
			
		}
	}

}
