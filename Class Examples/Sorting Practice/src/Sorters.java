import java.util.ArrayList;

public class Sorters {

	// Sin Recurision //
	public static void selectionSort(int[] numsswszxdsxdswx)
	{
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int k = 0; k < nums.length; k++)
				System.out.print(nums[k] + " ");
			System.out.println();
			
			// the actual sorting part //
			int posMin = i;
			for(int j = i + 1; j < nums.length; j++)
			{
				
				if(nums[j] < nums[i])
					posMin = j;
			}
			
			// the swap //
			int temp = nums[posMin];
			nums[posMin] = nums[i];
			nums[i] = temp;
			
		}
		
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println("\n");
	}
	
	
	public static void RselectionSort(int[] nums)
	{
		
	}
	// Merge Sort with recursion //
	public static void mergeSort(int[] nums)
	{
		for(int k = 0; k < nums.length; k++)
			System.out.print(nums[k] + " ");
		System.out.println();
		
		//////////////////////////////////////////////////////
		if(nums.length <= 1)
			return;
		
		int[] left = new int[nums.length/2];
		int[] right = new int[nums.length - left.length];
		
		for(int i = 0; i < left.length; i++)
			left[i] = nums[i];
		
		for(int i = 0; i < right.length; i++)
			right[i] = nums[left.length + i];
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, nums);
		//////////////////////////////////////////////////////
		
		
		
		for(int k = 0; k < nums.length; k++)
			System.out.print(nums[k] + " ");
		System.out.println();
		
		
		
	}
	
	public static void merge(int[] left, int[] right, int[] result)
	{
		int leftPos = 0;
		int rightPos = 0;
		int i = 0;
		
		while(leftPos < left.length && rightPos < right.length)
		{
			if(left[leftPos] < right[rightPos])
			{
				result[i] = left[leftPos];
				leftPos++;
				i++;
			}
			else
			{
				result[i] = right[rightPos];
				rightPos++;
				i++;
			}
		}
		
		for(int j = leftPos; j < left.length; j++)
		{
			result[i] = left[leftPos];
			leftPos++;
			i++;
		}
		
		for(int j = rightPos; j < right.length; j++)
		{
			result[i] = right[rightPos];
			rightPos++;
			i++;
		}
			
	}
}
