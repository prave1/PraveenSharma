 //Wap to print duplicate elelments in Array

package BubbleSort.com;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		
		String duplicates[]= new String[] {"java","Spring","Hibernate","java","Hibernate","Spring"};
		//Set nonDuplicatesSet= new HashSet<>();
		
		Set s= new HashSet<>();
		Set duplicatesSet = new HashSet<>();
		
		for(String string : duplicates)
		{
			if(!s.contains(string))
			{
				
				
			s.add(string);
				
			
				
			}
			
			else
			{
				duplicatesSet.add(string);
				
			}
		}
		System.out.println(duplicatesSet);
	}

}
