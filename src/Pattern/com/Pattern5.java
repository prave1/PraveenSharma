package Pattern.com;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		
		
		int n =0;
		
		for(int row=1;row<=2*n;row++){
            if(row <= n) {
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= 2*n-row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
		}
	
	}

}
