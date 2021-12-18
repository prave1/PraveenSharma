package test.com;

public class ReverseWord {
	
	public static void main(String[] args) {
		String s="India is the best country";
		
		String s1="";
		
		String a[]=s.split(" ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			s1=s1+a[i]+" ";
		}
		
		System.out.println(s1);
		
		
	}

}
