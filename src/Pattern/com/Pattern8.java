package Pattern.com;

public class Pattern8 {
	public static void main(String[] args) {
		
		int k=0;
		   for(int i=5;i>=1;--i){
			   
			   
				for(int space=0;space<5-i;++space){
					System.out.print(" ");
				}
				for(int j=i;j<=2*i-1;++j){
					System.out.printf("%d ",++k);
				}
				for(int j = 0;j<i-1; ++j){
					System.out.printf("%d ",++k);
				}
				System.out.println("");
			}
			  
	}

}


