package week5;

public class q8 {
	public static void main(String args[]) {
		
		int[] testCase1 = { 11, 12, 34, 55, 66, 77, 88 };
		int testNumber1 = 77;
		BinSearch binSearch = new BinSearch(testCase1,testNumber1);
		int position = binSearch.search();
		System.out.println(position + ",  the number of comparison is " + binSearch.getCount());
	}
}