import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        int sum = HourGlassSum(arr);
        System.out.println(sum);
    }
    
    
    
    public static int HourGlassSum(int[][] ar)
    {
    	int sum = 0;
    	for (int i = 0; i < 4; i++)
    	{
    		if (ar[i][i] != 0 && ar[i][i+2] != 0)
    		{
    			int first3 		= ar[i][i] 		+ ar[i+1][i] 	+ ar[i+2][i];
    			int midValue 	= 				  ar[i+1][i+1];
    			int last3 		= ar[i][i+2] 	+ ar[i+1][i+2] 	+ ar[i+2][i+2];
    			
    			if (sum < (first3 + midValue + last3))
    				sum = first3 + midValue + last3;
    		}
    	}
    	return sum;
    }
}
