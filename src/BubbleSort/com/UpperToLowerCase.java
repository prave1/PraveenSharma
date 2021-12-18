package BubbleSort.com;

public class UpperToLowerCase {
	
	public static void main(String[] args) {
		String s="PRAVEEN SHARMA";
		
		char[] ch=s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			
			System.out.println(ch[i]);
		}
	}

}
