package Stacks;

public class BalancedBracket {

	Node head;

	static class Node {
		char data;
		Node next;

		public Node(char data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	void push(char data) {
		Node node = head;
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	char pop() {
		Node node = head;
		if (head == null) {
			System.out.println("STACK UNDER FLOW");
			return 'z';
		} else {
			char c = head.data;
			head = node.next;
			return c;
		}
	}

	boolean Empty() {
		if (head == null)
			return true;
		return false;
	}

	boolean isBalanced(String str, BalancedBracket balancedBracket) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '[' || c == '{') {
				balancedBracket.push(c);
			} else {
				if (balancedBracket.Empty()) {
					return false;
				}
				char top = balancedBracket.pop();
				if ((top == '[' && top != ']') || top == '{' && top != '}') {
					return false;
				}
			}
		}
		return balancedBracket.Empty();

	}

	public static void main(String[] args) {

		BalancedBracket balancedBracket = new BalancedBracket();
		String str = "[]";
		boolean isBalanced = balancedBracket.isBalanced(str, balancedBracket);
		System.out.println(isBalanced);
	}

}
