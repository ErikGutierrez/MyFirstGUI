import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
       double neg = 0;
       double pos = 0;
       double zero = 0;
       double size = (double) arr.length;
       
       for (int i = 0; i < arr.length; i++)
       {
    	   //System.out.println(arr[i]);
    	   if(arr[i] < 0)
    		   neg++;
    	   else if (arr[i] > 0)
    		   pos++;
    	   else
    		   zero++;
       }
       
       double negs = neg/size;
       double poss = pos/size;
       double zeros = zero/size;
       
       System.out.println(poss);
       System.out.println(negs);
       System.out.println(zeros);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
