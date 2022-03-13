package test.com;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterCountString {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character:");
     	String s=sc.nextLine();
		
		char arr[]=s.toCharArray();  //make the String in char array 
		
		int count=0;
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0; i<arr.length; i++)   // character Array Applay the logic
		{
		   count=0;	
			for(int j=0; j<arr.length; j++)
			{
			if(arr[i]==arr[j])
			{
				count++;
			}
			}
			
		map.put(arr[i], count);
		}
		System.out.println(map);
	}

}
