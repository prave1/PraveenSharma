//Print All SubString in a given String	
package Interview.com;

class SubString
{
	public static void main(String args[])
	{
		String s="abc";
		
		for(int i=0; i<s.length(); i++)
		{
		 for(int j=i+1; j<=s.length(); j++)
		 {
			 System.out.println(s.substring(i,j));
			 
		 }
		}
	}
}