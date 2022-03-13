package Pratice.com;

import java.util.Arrays;

public class NewProgram {

	public static void main(String[] args) {
		
		
		
		
		
		int a[]= {2,12,3,15,12};
		int b[]= {4,5,7,8,96};
		
		int length=a.length+b.length;
		int merged[]= new int[length];
		 int post=0;
		 
		
		for(int ele: a) {
			 merged[post]=ele;
			 post++;
			
		}
		for(int ele: b)
		{
			merged[post]=ele;
			post++;
		}
		
		System.out.println(Arrays.toString(merged));
		
		
		for(int i=0; i<merged.length; i++)
		{
			for(int j=i; j<merged.length; j++)
			{
				if(merged[i]>merged[j])
				{
					
					int temp= merged[i];
					merged[i]=merged[j];
					merged[j]=temp;
					
				}
				
			}
			
			System.out.println(merged[i]+" ");
		}
		
		

	}

}
