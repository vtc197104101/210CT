package week5;

class q9 {
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
	}
}

class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;

	public BinaryNode(int d) {
		data = d;
		left = right = null;
	}

	public int getData() {
		return data;
	}
}

class BinarySearchTree {
	private BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	// isEmpty & search methods 
	public boolean isEmpty() {
		return root == null;
	}

	public BinaryNode search(BinaryNode t, int x) {
		if (t == null)
			return null;
		if (x < t.data)
			return search(t.left, x);
		else if (x > t.data)
			return search(t.right, x);
		else
			return t;
	}

	// insert method
	public void insert(int d) {
		root = insertSubtree(root, d);
	}

	private BinaryNode insertSubtree(BinaryNode t, int d) {
		if (t == null)
			t = new BinaryNode(d);
		else if (d < t.data)
			t.left = insertSubtree(t.left, d);
		else if (d > t.data)
			t.right = insertSubtree(t.right, d);
		return t;
	}

	private void visit(BinaryNode t) {
		System.out.print(Integer.toString(t.data) + " ");
	}
	// preorder method
	public void preorder() {
		preorderSubtree(root);
		System.out.println();
	}

	private void preorderSubtree(BinaryNode t) {
		if (t == null)
			return;
		visit(t);
		preorderSubtree(t.left);
		preorderSubtree(t.right);
	}
	// inorder method
	public void inorder() {
		inorderSubtree(root);
		System.out.println();
	}

	private void inorderSubtree(BinaryNode t) {
		if (t == null)
			return;
		inorderSubtree(t.left);
		visit(t);
		inorderSubtree(t.right);
	}
	//postorder method
	public void postorder() {
		postorderSubtree(root);
		System.out.println();
	}

	private void postorderSubtree(BinaryNode t) {
		if (t == null)
			return;
		postorderSubtree(t.left);
		postorderSubtree(t.right);
		visit(t);
	}

}