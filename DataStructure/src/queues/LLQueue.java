package queues;

class QNode {
	int data;
	QNode next;

	public QNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

public class LLQueue {
	QNode front, rear;

	public LLQueue() {
		this.front = null;
		this.rear = null;
	}

	void Enqueue(int data) {
		QNode node = new QNode(data);
		if (front == null) {
			this.front = this.rear = node;
			return;
		}
		this.rear.next = node;
		this.rear = node;
	}

	int Dequeue() {
		if(front == null) {
			System.out.println("Queue is empty!!!");
			throw new RuntimeException();
		}
		int temp = this.front.data;
		this.front = this.front.next;
		if(this.front == null) {
			this.rear = null;
		}
		return temp;
	}

	public static void main(String[] args) {
		LLQueue llQueue = new LLQueue();
		llQueue.Enqueue(10);
		System.out.println(llQueue.Dequeue());
	}

}
