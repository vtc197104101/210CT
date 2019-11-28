package week8;

import java.util.ArrayList;
import java.util.Stack;

public class q13 {

	public static void main(String[] args) {
		// Implement an unweighted, undirected graph
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		Node s = new Node("S");

		Node[] allNodes = { a, b, c, d, e, f, g, h, s };

		Adjacent ab = new Adjacent(b);
		Adjacent as = new Adjacent(s);

		Adjacent ba = new Adjacent(a);

		Adjacent cd = new Adjacent(d);
		Adjacent ce = new Adjacent(e);
		Adjacent cf = new Adjacent(f);
		Adjacent cs = new Adjacent(s);

		Adjacent dc = new Adjacent(c);

		Adjacent ec = new Adjacent(c);
		Adjacent eh = new Adjacent(h);

		Adjacent fc = new Adjacent(c);
		Adjacent fg = new Adjacent(g);

		Adjacent gs = new Adjacent(s);
		Adjacent gf = new Adjacent(f);
		Adjacent gh = new Adjacent(h);

		Adjacent hg = new Adjacent(g);
		Adjacent he = new Adjacent(e);

		Adjacent sa = new Adjacent(a);
		Adjacent sc = new Adjacent(c);
		Adjacent sg = new Adjacent(g);

		// Create all the remaining adjacents (connections)

		a.next = ab;
		ab.next = as;

		b.next = ba;

		c.next = cd;
		cd.next = ce;
		ce.next = cf;
		cf.next = cs;

		d.next = dc;

		e.next = ec;
		ec.next = eh;

		f.next = fc;
		fc.next = fg;

		g.next = gs;
		gs.next = gf;
		gf.next = gh;

		h.next = hg;
		hg.next = he;

		s.next = sa;
		sa.next = sc;
		sc.next = sg;

		Node currentNode = a; // start in Node a
		ArrayList<Node> stack = new ArrayList(); // create stack using arraylist
		ArrayList<Node> DFSoutput = new ArrayList();
		stack.add(a);
		DFSoutput.add(a);
		a.visited = true;

		while (stack.size() != 0) {

			currentNode = findNextNode(currentNode);
			if (currentNode != null) {	// add stack 
				currentNode.visited = true;
				DFSoutput.add(currentNode);
				stack.add(0, currentNode);
			} else {				// pop stack if currentNode is null
				stack.remove(0);
				if (stack.size() != 0) {
					currentNode = stack.get(0);
				}
			}

		}

		System.out.print("DFS output: ");
		for (int i = 0; i < DFSoutput.size(); i++) {
			System.out.print(DFSoutput.get(i).name);
		}
	}

	public static Node findNextNode(Node node) {
		Adjacent currentNext = node.next;

		while (currentNext != null) { // loop all adjacent with the node
			if (currentNext.connectedWith.visited == false) {
				return currentNext.connectedWith; // return node which visited is false
			}
			currentNext = currentNext.next;
		}
		return null; // return null if cannot find next node
	}
}
