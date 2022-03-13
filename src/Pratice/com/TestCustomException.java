package Pratice.com;

class BailaException extends RuntimeException {

	String str;

	BailaException(String str) {

		super(str);
	}
}

public class TestCustomException {

	public  static  void validate(int age) throws BailaException {
		
		if(age>18) {
			
			throw new BailaException("Bbaila don't have girls");
		}else {
			
			System.out.println("baila have girl chutt");
		}
		
	}
	public static void main(String[] args) {
		
	try {
		
		validate(20);
		return ;
	}catch(BailaException v) {
		
		v.printStackTrace();
		//System.exit(0);
	}finally {
		System.out.println("finally  lock");
	}
		
	}
}
