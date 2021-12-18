package test.com;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	
	public static void main(String[] args) {
		
		String s="welcome to TYSS welcome to bangalore";
		String []str=s.split(" ");
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		//step-1 create any set collection and all string array value into set
		
		for(int i=0; i<str.length; i++)
		{
			hs.add(str[i]);
		}
		
		for(String word : hs)
		{
			System.out.print(word+"  ");
		}
	}

}
