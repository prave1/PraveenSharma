//Stack Implement using array in java
package Collections.com;

import java.util.Stack;

public class StackImplement {

	int array[] = new int[5];
	int top = 0;

	private boolean push(int x) {
		top++;
		array[top] = x;
		System.out.println("Element Pushed into the Stack="+x);
		return true;

	}

	private int Pop() {
		int x = array[top--];
		System.out.println("Eelement Popped from Stack="+x);

		return x;
	}

	private int peek() {
		return array[top];

	}

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
	

		stack.pop();

		 System.out.println(stack.peek());

	}

}
