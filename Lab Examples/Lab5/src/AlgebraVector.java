

import java.util.Random;

public class AlgebraVector {

    public static double[][] geometricMatrix(int rows,int column,double a0, double ratio)
    {
    	
    	int counter = 0;
    	double VectA [][]= new double[rows][column];
    
    	for (int x = 0; x < rows; x++)
    		for(int y = 0; y < column; y++)
    		{
    			VectA[x][y] = a0*Math.pow(ratio, counter);
    			counter++;
    			
    		}
    	 return VectA;
    }
	
	public static double[][] scalarMult(double[][] a, double scalar)
    {
		int rows = a.length;
   	    int column = a[0].length;
    	double result [][]= new double[rows][column];
		
    	for(int x = 0; x < rows; x++)
    		for(int y = 0; y < column; y++)
    		{
    			result[x][y] = scalar*a[x][y];
    		}
    	
    	return result;

    }	
	
   public static double[][] matrixSum(double[][] a, double[][] b)
    {
   	     int rows = a.length;
   	     int column = a[0].length;
   	     double result[][]= new double[rows][column];
   	     
   	     for (int x = 0; x < rows; x++)
   	    	 for (int y = 0; y < column; y++)
   	    	 {
   	    		 result[x][y] = a[x][y] + b[x][y];
   	    	 }
   	     return result;
 
    }    
}
