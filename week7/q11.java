package week7;

public class q11 {
	// Bubble sort
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Test above
	public static void main(String args[]) {
		q11 ob = new q11();
		int arr[] = { 3, 11, 22, 99 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
