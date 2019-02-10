
public class Main {

	public static void main(String[] args) {
		int[] num1 = { 6, 5, 4, 3, 2, 1 };
		int[] num2 = { 5, 4, 6, 1, 2, 3 };

		//Sorters.selectionSort(num1);
		Sorters.selectionSort(num2);
		
		Sorters.mergeSort(num1);
	}

}
