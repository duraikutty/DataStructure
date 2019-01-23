package Recursive;

public class RecursiveDemo {
	static int recursion(int i) {
		System.out.println("Calc F(" + i + ")");
		if (i == 0) {
			System.out.println("Done F(" + i + ")");
			return 1;
		}
		int j = i * recursion(i - 1);
		System.out.println("Value : " + j + " Done F(" + i + ")");
		return j;
	}

	static int fib(int i) {
		if (i <= 1) { 
			return i;
		}
		int F1 = 0, F2 = 1, F = 0;
		for (int j = 2; j <= i; j++) {
			F = F1 + F2;
			F1 = F2;
			F2 = F;
		}
		return F;
	}

	static int fibRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibRecursive(n - 1) + fibRecursive(n - 2);
	}

	static int[] memoize = new int[500];

	static int RecursionWithMemoization(int n) {
		if (memoize[n] != -1) {
			return memoize[n];
		}
		memoize[n] = RecursionWithMemoization(n - 1) + RecursionWithMemoization(n - 2);
		return memoize[n];
	} 

	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			memoize[i] = -1;
		}
		memoize[0] = 0;
		memoize[1] = 1;
		System.out.println(fib(400));
		System.out.println(RecursionWithMemoization(400));
	}

}
