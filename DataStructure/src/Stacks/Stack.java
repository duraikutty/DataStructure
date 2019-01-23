package Stacks;

public class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	public Stack() {
		top = -1;
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack under flow");
			return 0;
		} else {
			return a[top--];
		}
	}

	boolean push(int data) {
		if (top >= MAX-1) {
			System.out.println("Stack over flow");
			return false;
		} else {
			System.out.println(top);
			a[++top] = data;
			return true;
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		for(int i=0;i<1001;i++) {
			stack.push(10);
		}
		System.out.println("POP : "+stack.pop());
		System.out.println("POP : "+stack.pop());

		System.out.println("POP : "+stack.pop());
		System.out.println("POP : "+stack.pop());

		System.out.println("POP : "+stack.pop());
		System.out.println("POP : "+stack.pop());

		
		
	}

}
