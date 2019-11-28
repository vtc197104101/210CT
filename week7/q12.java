package week7;

import java.util.Scanner;

class q12 {
	int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int storeIndex = low + 1;
		for (int i = low + 1; i <= high; i++) {
			// If current element is smaller than the pivot
			if (arr[i] < pivot) {
				swap(arr, i, storeIndex);
				storeIndex++;
			}
		}

		swap(arr, storeIndex - 1, low);

		return storeIndex - 1;
	}

	void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	void sort(int arr[]) {
		sort(arr, 0, arr.length - 1);
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {
			// pi is partitioning index
			int pi = partition(arr, low, high);

			// Recursively sort elements before partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Test the program
	public static void main(String args[]) {
		int s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of items");
		s = Integer.parseInt(sc.nextLine());
		int arr[] = new int[s];
		System.out.println(s + " items:");
		for (int i = 0; i <= s - 1; i++) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter values " + (i + 1) + ":");
			int input = Integer.parseInt(sc1.nextLine());
			arr[i] = input;
		}

		q12 ob = new q12();
		ob.sort(arr);

		System.out.println("sorted array :");
		printArray(arr);
	}
}