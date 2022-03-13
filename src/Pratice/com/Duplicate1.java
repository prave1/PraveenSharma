package Pratice.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate1 {
	public static void main(String[] args) {
	
		DuplicateCharacter("Praveen");
		DuplicateCharacter(null);
		DuplicateCharacter("javatesla ");
		DuplicateCharacter("");
	}

	public static void DuplicateCharacter(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("Empty is String");
		}
		if(str.length()==1)
		{
			System.out.println("Single char String");
		}
		char[] words = str.toCharArray();
		
		Map<Character,Integer> charMap= new HashMap<Character,Integer>();
		for(Character ch: words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
				
			}
			else
			{
				charMap.put(ch, 1);
			}
			
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
}
