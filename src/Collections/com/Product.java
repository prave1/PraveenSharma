package Collections.com;

import java.util.ArrayList;
import java.util.Collections;

public class Product {
	
	public static void main(String[] args) {
		
		ArrayList<String>lst= new ArrayList<String>();
		
		lst.add("A");
		lst.add("X");
		lst.add("D");
		lst.add("Y");
		
	System.out.println(lst);
	Collections.sort(lst);
	System.out.println(lst);
	
	Collections.sort(lst,Collections.reverseOrder());
	System.out.println(lst);
	
		
		
		
	}

}
