package week4;

public class Queue {
	LinkedList linkList;		// composite a LinkedList 

	// constructor
	public Queue() {
		linkList = new LinkedList();
	}

	// Check if the queue is empty
	public boolean empty() {
		return linkList.isEmpty();
	}

	// add object to the queue
	public void enqueue(Object o) {
		linkList.addToTail(o);
	}

	// remove object from the queue
	public Object dequeue() {
		return linkList.removeFromHead();
	}

	// Overriding toString method 
	public String toString() {
		return linkList.toString();
	}
}
