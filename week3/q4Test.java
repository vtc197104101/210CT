package week3;

public class q4Test {
	public static void main(String args[]) {
		LinkedList s = new LinkedList();
		System.out.println(s);

		s.addToTail(60);
		System.out.println(s);
		s.addToTail('y');
		System.out.println(s);
		s.addToTail("hello");
		System.out.println(s);

		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
		}

		s.addToHead(60);
		System.out.println(s);
		s.addToHead('y');
		System.out.println(s);
		s.addToHead("hello");
		System.out.println(s);

		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
		}

	}
}