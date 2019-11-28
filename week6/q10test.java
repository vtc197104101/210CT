package week6;

public class q10test {
	public static void main(String[] args) {
		int data = 0;
		BinarySearchTree tree = new BinarySearchTree();
		int[] testCase1 = { 2, 7, 9, 4, 1, 5, 3, 6, 0, 8 };
		System.out.println("Inserting :");
		for (int k = 1; k <= testCase1.length; k++) {
			data = testCase1[k - 1];
			tree.insert(data);
			System.out.print(data + " ");
		}
		System.out.println();

		System.out.println("In ascending order :");
		tree.inorder();
		tree.delete(data);// delete the last inserted
		tree.inorder();
	}
}
