
public class Sorters {

	public static void selectionSort(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{

			for(int n = 0; n < numbers.length; n++)
				System.out.print(numbers[n]);
			System.out.println("\n");
			
			int posMin = i;
			int posMax = numbers.length-1 - i;
			for(int j = i+1; j < numbers.length; j++)
			{
				
				if(numbers[j] < numbers[posMin])
					posMin = j;
				if(numbers[j] > numbers[posMax])
					posMax = j;
			}
			
			System.out.println("\nCurrent min: " + numbers[posMin]
								+ "\nCurrent Max: " + numbers[posMax]);
			// Swaps the two values around //
			if(posMin == i)
			{
				int tempMin = numbers[posMin];
				numbers[posMin] = numbers[i];
				numbers[i] = tempMin;
			}
			////////////////////////////////
			int tempMax = numbers[posMax];
			numbers[posMax] = numbers[i];
			numbers[numbers.length-1-i] = tempMax;
		}
	}
	
	public static void mergeSort(int[] nums)
	{
		for(int n = 0; n < nums.length; n++)
			System.out.print(nums[n]);
		System.out.println("\n");
		
		if(nums.length <= 1)
			return;
		
		else
		{
			int[] lefthalf = new int[nums.length / 2];
			int[] rightHalf = new int[nums.length / 2];
			
			for(int i = 0; i < lefthalf.length; i++)
				lefthalf[i] = nums[i];
			
			for(int i = 0; i < rightHalf.length; i++)
				rightHalf[i] = nums[lefthalf.length + i];
			mergeSort(lefthalf);
			mergeSort(rightHalf);
			merge(lefthalf, rightHalf, nums);
			
		}
	}
	
	public static void merge(int[] left, int[] right, int[] result)
	{
		int leftPos = 0; 
		int rightPos = 0;
		int resultPos = 0;
		
		while(leftPos < left.length && rightPos < right.length)
		{
			if(left[leftPos] < right[rightPos])
			{
				result[resultPos] = left[leftPos];
				leftPos++;
				resultPos++;
			}
			else
			{
				result[resultPos] = right[leftPos];
				rightPos++;
				resultPos++;
			}
		}
		
		for(int i = leftPos; i < left.length; i++)
			result[resultPos] = left[leftPos];
		
		for(int i = rightPos; i < right.length; i++)
			result[resultPos] = right[rightPos];
	}
	
}
