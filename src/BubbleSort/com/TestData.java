package BubbleSort.com;

import java.util.LinkedHashSet;

public class TestData {
	public static void main(String[] args) {
		
		String s="praveen";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{

			hs.add(ch[i]);
		}
		int count=1;
		for(Character h:hs)
		{
			System.out.println(h +" is="+ count);
			count++;
		}
	}

}
