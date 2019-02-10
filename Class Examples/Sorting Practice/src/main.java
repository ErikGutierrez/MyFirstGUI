import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		// Some arrays to be sorted //
		int[] a1 = { 0, 2, 5, 7, 8 };
		int[] a2 = { 8, 3, 2, 9, 0, 78 };
		int[] a3 = { 2, 1, 4, 5, 9, 10 };
		int[] a4 = { 20, 21, 15, 71, 84 };
		int[] a5 = { 2, 1, 3, 6, 9 };
		int[] a6 = { 5, 2, 8, 1, 3, 4 };
		
		
		
		
		Sorters.selectionSort(a1);
		Sorters.selectionSort(a2);
		Sorters.selectionSort(a3);
		Sorters.selectionSort(a4);
		Sorters.selectionSort(a5);
		
		Sorters.mergeSort(a6);

	}

}


