package Stacks;

public class StackLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void push(int data) {
		Node node = head;
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return;
	}
	
	int pop() {
		Node node = head;
		if(head == null) {
			System.out.println("Stack under flow");
			return 0;
		}
		int data = node.data;
		head = node.next;
		return data;
	}

	public static void main(String[] args) {
		StackLinkedList sll = new StackLinkedList();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		sll.push(40);
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		
		
	}

}
