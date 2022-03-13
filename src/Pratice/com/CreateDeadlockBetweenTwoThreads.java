package Pratice.com;

/**
 * Description:- 
 * Deadlock describes a situation where two or more threads are
 * blocked forever, waiting for each other. Deadlocks can occur in Java when the
 * synchronized keyword causes the executing thread to block while waiting to
 * get the lock, associated with the specified object.
 *
 */
public class CreateDeadlockBetweenTwoThreads {
	String str1 = "Hello";
	String str2 = "rajeev";

	Threading1 t1 = new Threading1() {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + " " + str2);
					}
				}
			}
		}
	};
	Threading1 t2 = new Threading1() {
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + " " + str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		CreateDeadlockBetweenTwoThreads obj = new CreateDeadlockBetweenTwoThreads();
		obj.t1.start();
		obj.t2.start();
	}

}
