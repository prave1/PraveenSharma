// How to reverse the order of elements in ArrayList in java............
package Interview.com;

import java.util.*;
import java.util.ArrayList;

public class ReverseCollection {
	public static void main(String[] args) {
		
	List<Integer> list= new ArrayList<>();
	
	            list.add(1);
	            list.add(2);
	            list.add(3);
	            list.add(4);
	            
		System.out.println("Before Reversing="+list);
		Collections.reverse(list);
		System.out.println("After Reversing="+list);
		
	}

}
