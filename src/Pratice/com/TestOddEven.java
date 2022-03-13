package Pratice.com;

class Threading1 extends Thread {

	public void run() {

		for (int i = 1; i <= 20; i++) {
			if(i%2==0){
				System.out.println("Number is  Even ="+i);
			}else{
				System.out.println("Number  is odd  = "+i);
			}
		}
	}
}

class Threading2 extends Thread {

	public void run() {

		for (int i = 21; i <= 40; i++) {
			if(i%2==0){
				System.out.println("Number is  Even = "+i);
			}else{
				System.out.println("Number  is Odd  =  "+i);
			}
		}
	}
}

class Threading3 extends Thread {

	public void run() {

		for (int i = 41; i <= 60; i++) {
			if(i%2==0){
				System.out.println("Number is  Even = "+i);
			}else{
				System.out.println("Number  is Odd  = "+i);
			}
		}
	}
	}

class TestOddEven{
	
	public static void main(String[] args) {
		
		Threading1 one = new Threading1();
		Threading2 two = new Threading2();
		Threading3 three = new Threading3();
		
		try{
			one.start();
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			one.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		two.start();
		try{
			two.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		three.start();
	}
}