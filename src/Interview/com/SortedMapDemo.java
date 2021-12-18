//How to Sort hashmap keys in java............

package Interview.com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
	
	public static void main(String[] args) {
		System.out.println("------------Unsorted Map---------------");
		Map<String,String> unsortedMap = new HashMap<>();
		
		unsortedMap.put("apple","apple");
		unsortedMap.put("pineapple","pineapple");
		unsortedMap.put("banana","banana");
		unsortedMap.put("guava","guava");
		
		for(Map.Entry<String,String> entry: unsortedMap.entrySet() )
		{
			System.out.println("UnSorte Key Value="+entry.getKey());
		}
		
		
		System.out.println("------------Sorted Map-----------------------");
		Map<String, String> treeMap= new TreeMap<String,String>(unsortedMap);
		for(Map.Entry<String, String> entry: treeMap.entrySet())
		{
			
			System.out.println("Key Values="+entry.getKey());
		}
		
		
	}

}
