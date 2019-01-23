package Sorting;

public class MergeSort {

	public static void merge(int[] arr, int start, int medium, int end) {
		System.out.println("****");
		System.out.println("START : " + start);
		System.out.println("MEDIAN : " + medium);
		System.out.println("END : " + end);
		System.out.println("****");

		int n1 = medium - start + 1;
		int n2 = end - medium;
		
		System.out.println("n1 "+n1+" n2 "+n2);

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[start + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[medium + j];
		
		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = start; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < n1) 
		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 

	}

	public static void sort(int[] arr, int start, int end) {
		if (start < end) {
			int medium = (start + end) / 2;
			sort(arr, start, medium);
			sort(arr, medium + 1, end);
			merge(arr, start, medium, end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5,4, 3, 2, 1 };
		sort(arr, 0, arr.length);
		System.out.println("***END***");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
