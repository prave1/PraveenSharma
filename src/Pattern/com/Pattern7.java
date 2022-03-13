package Pattern.com;
/**
 * 
    *
   ***
  *****
 *******
*********

 *
 */

public class Pattern7 {

	public static void main(String[] args) {
		 for(int i=1,k=0;i<=5;++i,k=0){
			 
				for(int space=1;space<=5-i;++space){
					System.out.print(" ");
				}
				while(k!=2*i-1){
					System.out.print("*");
					++k;
				}
				System.out.println();
			}
	}
}
