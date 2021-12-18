//Wap to find factorial for large number????s
package Interview.com;

import java.math.BigInteger;

public class FindFactorial {
	public static void main(String[] args) {

		int n = 10;
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Facorial="+fact);
	}

}
