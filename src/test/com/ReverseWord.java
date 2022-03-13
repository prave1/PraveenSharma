package test.com;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String s="india is great country";
	  
		 String a="";
		 String[] s1 = s.split(" ");
		
		
		
		for(int i=s1.length-1; i>=0; i--)
		{
		   a=a+s1[i]+" ";
		   
			//System.out.print(s1[i]+" ");
		}
		
		System.out.println(a);
	
	
	}

}
