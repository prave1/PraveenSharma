package Interview.com;

import java.util.Arrays;

public class CharacterSort {
	
	public static void main(String[] args) {
		String s="Praveen";
		
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		
		
		String sorteds= new String(ch);
		System.out.println(sorteds);
	}

}
