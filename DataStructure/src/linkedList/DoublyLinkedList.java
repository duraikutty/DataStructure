package linkedList;

public class DoublyLinkedList {
	Node head;

	static class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	public void pushFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;
		if (head != null)
			head.prev = newNode;
		head = newNode;

	}

	int TopFront() {
		return head.data;
	}

	void PopFront() {
		Node node = head;
		head = node.next;
		head.prev = null;
	}

	void pushBack(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	int TopBack() {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		return node.data;
	}

	void PopBack() {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		System.out.println("DSRSS : " + node);
		// TODO
	}

	boolean Find(int data) {
		Node node = head;
		while (node != null) {
			if (node.data == data) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	boolean Empty() {
		if (head == null)
			return true;
		return false;
	}

	void Erase(int data) {
		if (head != null && head.data == data) {
			head = head.next;
			head.prev = null;
		}
		Node node = head;
		while (node != null && node.data != data) {
			node = node.next;
		}
		if (node != null) {
			Node prev = node.prev;
			prev.next = node.next;
		}
	}

	void AddBefore(Node node, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == node) {
			head.prev = newNode;
			newNode.next = head;
			newNode.prev = null;
			head = newNode;
			return;
		}
		while (temp != node) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Node not found");
			return;
		}
		Node prev = temp.prev;
		Node nextNode = temp.next;
		newNode.next = temp;
		newNode.prev = temp.prev;
		prev.next = newNode;
		nextNode.prev = newNode;

	}

	void AddAfter(Node node, int key) {

	}

	void printDetailedDoublyLinkedList() {
		Node node = head;
		while (node != null) {
			System.out.println("DATA : " + node.data);
			System.out.println("PREV : " + node.prev);
			System.out.println("NEXT : " + node.next);
			node = node.next;
		}
	}

	void printDoublyLinkedList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.pushFront(10);
		doublyLinkedList.pushFront(20);
		doublyLinkedList.pushFront(30);
		doublyLinkedList.pushFront(60);
		doublyLinkedList.printDoublyLinkedList();
		System.out.println("****");
		// System.out.println(doublyLinkedList.TopFront());
		// doublyLinkedList.printDoublyLinkedList();
		// doublyLinkedList.PopFront();
		// doublyLinkedList.pushBack(456);
		// System.out.println("****");
		// System.out.println("TopBack : "+doublyLinkedList.TopBack());
		// System.out.println("****");
		// doublyLinkedList.PopBack();
		// doublyLinkedList.printDoublyLinkedList();
		// System.out.println("****");
		// System.out.println(doublyLinkedList.Find(10));
		// doublyLinkedList.printDoublyLinkedList();
		// System.out.println("****");
		// doublyLinkedList.Erase(10);
		// doublyLinkedList.printDoublyLinkedList();
		// System.out.println("******");
		doublyLinkedList.printDetailedDoublyLinkedList();
		//doublyLinkedList.AddBefore(doublyLinkedList.head.next.next.next, 741);
		//doublyLinkedList.printDoublyLinkedList();
	}
}