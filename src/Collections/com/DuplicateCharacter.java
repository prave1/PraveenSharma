
// wap to print Duplicate character with number of occurance in java
package Collections.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
	public static void main(String[] args) {
		
		
		String str="Praveen";
		
	     displayDuplicates(str);
		
	}
	public static void displayDuplicates(String str)
	{
		Map<Character,Integer> map= new HashMap<>();
		
		char[]charactrs=str.toCharArray();
		for(char c: charactrs)
		{
			if(!map.containsKey(c))
			{
				map.put(c,1);
				
			}
			else
			{
				map.put(c,map.get(c)+1);
			}
			
			Set<Map.Entry<Character, Integer>> entrySet=map.entrySet();
			for(Map.Entry<Character, Integer> entry: entrySet)
			{
				if(entry.getValue()>1)
				{
					System.out.printf("%s : %d %n", entry.getKey(),entry.getValue());
				}
			}
			
		}
	}

}
