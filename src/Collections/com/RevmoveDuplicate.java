// How to remove the Duplicate from String in java

package Collections.com;

import java.util.HashSet;
import java.util.Set;

public class RevmoveDuplicate {
	public static void main(String[] args) {
		
		
		String str="Praveen Sharma.";
		
		System.out.println(removeDuplicates(str));
		
		
	}
	public static String removeDuplicates(String str)
	{
		Set<Character> set= new HashSet<>();
		StringBuffer sf= new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			Character c=str.charAt(i);   // str.charAt(0)-------->s
			
			if(!set.contains(c))           // if 's' is not present in hashset
			{
				set.add(c);               // add s to the set 
				sf.append(c);              // s
				
			}
		}
		
		return sf.toString();
	}

}
