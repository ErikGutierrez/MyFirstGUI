package SimpleList_QueDeque;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SimpleListTester {

	public static void main(String[] args) {
		circularArrayTester();
		

	}

	private static void circularArrayTester()
	{
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String F = "F";
		String E = "E";
		String G = "G";
		String first = "First";
		String last = "Last";
		
		SimpleListWithCircularArrays<String> L = new SimpleListWithCircularArrays<String>();
		SLWithCircularArraysClassVer<String> l = new SLWithCircularArraysClassVer<String>();
		L.addFirst(A);
		L.print();
		L.addFirst(B);
		L.print();
		L.addFirst(C);
		L.print();
		L.addFirst(D);
		L.print();
		L.addFirst(E);
		L.print();
		L.addFirst(F);
		L.print();
		L.addFirst(G);
		System.out.println();
//		l.addFirst(A);
//		l.print();
//		l.addFirst(B);
//		l.print();
//		l.addFirst(C);
//		l.print();
//		l.addFirst(D);
//		l.print();
//		l.addFirst(E);
//		l.print();
//		l.addFirst(F);
//		l.print();
//		l.addFirst(G);
		
		System.out.print("L ideal: G, F, E, D, C, B, A \nL real:  ");
		L.print();
		System.out.println("\n");
		
//		System.out.println(L.removeFirst() + ", " + L.removeLast());
//		System.out.println();
		
		L.addFirst(first);
		L.addLast(last);
		
		System.out.print("L ideal: First, G, F, E, D, C, B, A, Last \nL real:  ");
		L.print();
		System.out.println("\n");
		
		System.out.println(L.removeFirst() + ", " + L.removeLast());
		
	}
}
