package test.com;

import java.util.LinkedHashSet;

public class InputString {
	public static void main(String[] args) {
		
	
		String s=  "12112145";
		
		
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		int sum=0;
		for(Character ch: set)
		{
			
			sum=sum+ch-48;
		}
		System.out.println("Duplicate of Sum Values="+sum);
	

	}

}
