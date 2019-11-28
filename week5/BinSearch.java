package week5;

public class BinSearch {
	private  int globalArray[];
	private  int globalKey;
	private  int globalCount;

	// binSearch
	public BinSearch(int array[], int key) {
		globalArray = array;
		globalKey = key;
	}
	public int search() {
		return (binSearchRecur(0, globalArray.length - 1));
	}
	// binSearchRecur
	private  int binSearchRecur(int low, int high) {
		int middle;
		if (low > high)
			return -1;
		middle = (low + high) / 2;
		globalCount++;
		return globalKey == globalArray[middle] ? middle
				: globalKey < globalArray[middle] ? binSearchRecur(low, middle - 1) : binSearchRecur(middle + 1, high);
	}

	public  int getCount() {
		return globalCount;
	}
}