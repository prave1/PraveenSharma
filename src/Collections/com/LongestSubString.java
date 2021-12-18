//Longest Substring without repetition of character
package Collections.com;

import java.util.HashSet;

public class LongestSubString {
	
	public static void main(String[] args) {
		
		String str="abcd"; 
		
		Longest(str);
		
		
	}

	private static String Longest(String str) {
		HashSet<Character> set= new HashSet<>();
		
		String longestOverall="";
		String longestTillnow="";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(set.contains(c))
			{
				longestTillnow="";
				set.clear();
			}
			longestTillnow+=c;
			
			set.add(c);
			
			if(longestTillnow.length()>longestOverall.length())
			{
				longestOverall=longestTillnow;
			}
		}
		return longestOverall;
		
	}

}
