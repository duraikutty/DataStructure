package linkedList;

class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void PushFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	int TopFront() {
		Node node = head;
		return node.data;
	}

	void PopFront() {
		Node node = head.next;
		head = node;
	}

	void pushBack(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = newNode;
		return;
	}

	int TopBack() {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		return node.data;
	}

	void PopBack() {
		// TODO
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = null;
	}

	boolean Find(int data) {
		Node node = head;
		while (node != null) {
			if (node.data == data)
				return true;
			node = node.next;
		}
		return false;
	}

	boolean Empty() {
		if (head == null) {
			return true;
		}
		return false;

	}

	void Erase(int data) {
		Node prev = null, temp = head;
		if (temp != null && temp.data == data) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	void AddBefore(Node prevNode, int data) {
		Node newNode = new Node(data);
		Node temp = head, prev = null;
		if (temp == prevNode) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (temp != null && temp.data != prevNode.data) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Node not present");
			return;
		}
		prev.next = newNode;
		newNode.next = temp;

	}

	void AddAfter(Node afterNode, int data) {

		Node newNode = new Node(data);
		Node node = head;
		while (node != null && node.data != afterNode.data) {
			node = node.next;
		}
		if (node == null)
			return;
		newNode.next = node.next;
		node.next = newNode;

	}

	int lengthByIterative(Node head) {
		int count = 0;
		while (head != null) {
			count = count + 1;
			head = head.next;
		}
		return count;
	}

	int lengthByRecursive(Node head) {
		if (head == null)
			return 0;
		return 1 + lengthByIterative(head.next);
	}

	int GetNthNode(int index) {
		Node node = head;
		int count = 0;
		while (head != null) {
			if (count == index) {
				return head.data;
			}
			head = head.next;
			count++;
		}
		assert (false);
		return 0;
	}

	void getNthFromLast(Node head, int n) {
		int length = 0;
		Node temp = head;
		while (head != null) {
			length = length + 1;
			head = head.next;
		}
		if (length < n) {
			System.out.println("Index is greater than length");
			return;
		}
		for (int i = 1; i < length - n + 1; i++) {
			temp = temp.next;
		}
		System.out.println("Nth Node : " + temp.data);
		return;
	}

	int getMiddle(Node head) {
		int length = 0;
		Node temp = head;
		while (head != null) {
			length++;
			head = head.next;
		}
		int middle = length / 2;
		for (int i = 1; i < middle + 1; i++)
			temp = temp.next;
		return temp.data;
	}

	int detectLoop(Node head) {
		Node slow = head, fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return 1;
			}
		}
		return 0;
	}
	
	

	void PrintLinkedList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.PushFront(10);
		linkedList.PushFront(11);

		int topFront = linkedList.TopFront();
		// System.out.println("topFront : " + topFront);
		//linkedList.PopFront();
		System.out.println("****");
		linkedList.PrintLinkedList();
		System.out.println("****");
		linkedList.pushBack(77);
		System.out.println("****");
		linkedList.PrintLinkedList();
		System.out.println("****");
		// System.out.println("TopBack : " + linkedList.TopBack());
		/*linkedList.PopBack();
		// System.out.println(linkedList.Find(77));
		linkedList.PopBack();
		linkedList.Erase(77);
		linkedList.AddBefore(linkedList.head, 1000);
		linkedList.AddAfter(linkedList.head, 500);
		// System.out.println(linkedList.lengthByIterative(linkedList.head));
		// System.out.println(linkedList.lengthByRecursive(linkedList.head));
		System.out.println("****");
		linkedList.PrintLinkedList();
		// System.out.println(linkedList.GetNthNode(3));
		System.out.println("****");
		linkedList.getNthFromLast(linkedList.head, 2);*/

	}
}
