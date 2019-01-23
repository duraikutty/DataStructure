package heaps;

public class MaxHeap {
	int size;
	int maxSize;
	int[] heapArr;

	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		heapArr = new int[maxSize];
	}

	void createHeap(int[] arr) {
		heapArr = arr;
	}

	void heapify(int root) {
		
	}

	void bulidMaxHeap() {
		for(int i = heapArr.length/2;i<=0;i--) {
			heapify(i);
		}
	}

	void printHeap() {
		for (int i : heapArr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10);
		int[] temp = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		heap.createHeap(temp);
		heap.printHeap();

	}

}
