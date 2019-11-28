package week4;

import java.util.Stack;
import java.util.Iterator;

public class q6Test {
	public static void main(String args[]) {
		Stack s = new Stack();

		System.out.println(s);

		System.out.println("Patrick is at " + s.search("Patrick"));

		s.push('A');
		System.out.println(s);
		s.push('B');
		System.out.println(s);
		s.push("Cat");
		System.out.println(s);
		s.push("Dog");
		System.out.println(s);
		s.push(123);
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push('E');
		System.out.println(s);
		s.push(789.123);
		System.out.println(s);

		System.out.println("peek() returns: " + s.peek());
		System.out.println("Patrick is at " + s.search("Patrick"));
		System.out.println("A is at " + s.search('A'));
		System.out.println("789.123 is at " + s.search(789.123));
		System.out.println("Peter is at " + s.search("Peter"));

		System.out.println();
	}

}
