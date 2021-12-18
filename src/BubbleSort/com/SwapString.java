package BubbleSort.com;

public class SwapString {
	public static void main(String[] args) {
		
		String s1="Hello"; // After swaping s1=Anil
		String s2="Anil";
		
		String s=s1+s2;
		
		System.out.println("Before Swaping:"+s1+" "+s2);
		s2=s.substring(0, s.length()-s2.length());
		
		s1=s.substring(s2.length());
		System.out.println("After Swaping :"+s1+" "+s2);
		
	}

}
