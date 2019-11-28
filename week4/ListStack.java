package week4;

class ListStack extends LinkedList {
	public ListStack() {
		super();
	}

	public boolean empty() {
		return isEmpty();
	}

	public void push(Object o) {
		addToHead(o);
	}

	// Popping element from the top of the stack
	public Object pop() {
		System.out.println("Pop :");

		return removeFromHead();
	}

	// Displaying element on the top of the stack
	public Object peek() {
		return getHead().getData();
	}

	// Searching element in the stack
	public int search(Object o) {
		int p = -1;

		ListNode current = getHead();
		for (int i = 0; current != null; i++) {
			if (current.getData() == o) {
				p = i;
				break;
			}
			current = current.getNext();
		}


		return p;
	}
}