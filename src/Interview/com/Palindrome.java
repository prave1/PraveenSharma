package Interview.com;

import java.util.Scanner;

class Palindrome {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n = sc.nextInt();

		int res = 0;

		int temp = n;
		while (n > 0) {
			int digit = n % 10;
			res = res * 10 + digit;
			n = n / 10;

		}

		if (temp == res) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}