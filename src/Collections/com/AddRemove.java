package Collections.com;

import java.util.ArrayList;

public class AddRemove {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add("Welcome");
		al.add("this");
		al.add("to world");
		al.add("world");
		
		
		for(Object o: al)
		{
			System.out.println(o);
		}
		
		al.remove(0);           // Use any one of the bellow three statement to remove one String among 4 of them
		al.remove(3);           // to remove first last String
		al.remove("this");      // to remove specific String
		
	System.out.println("-----------------------------");
	
	for(Object ele: al)
	{
		System.out.println(ele);
	}
	
		
		
		
	}

}
