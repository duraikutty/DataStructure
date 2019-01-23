package queues;

public class Queue {
	int front = 0, rear = 0, size = 0, capacity;
	int[] arr;

	Queue(int capacity) {
		this.capacity = capacity;
		this.rear = capacity;
		arr = new int[capacity];
	}

	public void Enqueue(int data) {

		if (size + 1 == capacity) {
			System.out.println("Queue is full");
			return;
		}
		this.rear = this.rear % this.capacity;
		arr[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
	}

	public int Dequeue() {
		if (front == rear) {
			System.out.println("Queue empty");
			throw new RuntimeException();
		}
		front = front % capacity;
		int temp = arr[front];
		front = (front + 1) % capacity;
		size--;
		return temp;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.Enqueue(10);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(20);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(30);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(40);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(50);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(60);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Enqueue(70);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");
		queue.Dequeue();
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println("******");

	}
}
