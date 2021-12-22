//Write java Program to Print character Count in each word in
package Interview.com;

public class CountWord {
	static void count(String str)
	{
		char[] ch=str.toCharArray(); // Create and char array of given String
		
		for(int i=0; i<ch.length; i++)
		{
			String s="";             // Decalre an String  with empty  Initializatio
			
			
			
			while(i<ch.length && ch[i]!=' ')   // When the character is not spadce
			{
				
				s=s+ch[i];                    //""+'H',"E","L","L","O"
				
				i++;
				 
			}
			if(s.length()>0)
				System.out.println(s+"="+s.length());
		}
		
	}
	
	public static void main(String[] args) {
		String str="India is great country";
		count(str);
		
	}

}
