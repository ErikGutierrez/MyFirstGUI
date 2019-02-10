package DataStructures;

import DataStructuresLinkedList.LinkedList;
import DataStructuresLinkedList.LinkedListIndexList;

public class main {
	
	public static void main(String[] args) {
//		IndexList<String> List = new ArrayIndexList<String>(10);
//		List.add("A"); // 0
//		List.add("B"); // 1
//		List.add("C"); // 2
//		List.add("D"); // 3
//		List.add("E"); // 4
//		List.add("F"); // 5
//
//		List.print();
//		
//		List.set(4, "e");
//		List.print();
//		
//		List.add(2, "Cc");
//		List.print();
//		System.out.println(List.size() + "\n");
//		
//		List.remove(2);
//		List.remove(4);
//		List.print();
//		System.out.println(List.size() + "\n");
//		
//		List.add(3, "E");
//		List.add(0, "aa");
//		List.add(List.size(), "G");
//		List.print();
//		System.out.println(List.size() + "\n");
//		
//		System.out.println(List.get(List.size()-1));
		
		IndexList<String> L1 = new LinkedListIndexList<String>();
		IndexList<String> L2 = new LinkedList<String>();
		
		
		L1.add("Alpha");
		L2.add("alpha");
		
		L1.add("Bravo");
		L2.add("bravo");
		
		L1.add("Charlie");
		L2.add("charlie");
		
		L1.add("Delta");
		L2.add("delta");
		
		L1.add("Echo");
		L2.add("echo");
		
		L1.add(L1.size(), "Foxtrot");
		L2.add(L2.size(), "foxtrot");
		
		System.out.println("Printing L1 and L2 after adding 6 items to them:");
		System.out.print("L1: ");
		L1.print();
		System.out.print("L2: ");
		L2.print();
		System.out.println();
		
		L1.set(0, "Alfa");
		L2.set(0, "alfa");
		L1.set(5, "Grayfox");
		L2.set(5, "grayfox");
		L1.set(2, "Charles");
		L2.set(2, "charles");
		
		System.out.println("Printing L1 and L2 after changing items");
		System.out.print("L1: ");
		L1.print();
		System.out.print("L2: ");
		L2.print();
		System.out.println();
		
		L1.add(3, "Xavier");
		L2.add(3, "xavier");
		L1.add(0, "Omega");
		L2.add(0, "omega");
		
		System.out.println("Printing L1 and L2 after adding items to beginig and middle");
		System.out.print("L1: ");
		L1.print();
		System.out.print("L2: ");
		L2.print();
		System.out.println();
		
		System.out.println(L1.remove(0));
		System.out.println(L1.remove(3));
		System.out.println(L2.remove(0));
		System.out.println(L2.remove(3));
	
		System.out.println();
		System.out.print("L1: ");
		L1.print();
		System.out.print("L2: ");
		L2.print();
		System.out.println();
	}

}
