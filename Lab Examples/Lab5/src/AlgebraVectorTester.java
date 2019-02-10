import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;


class AlgebraVectorTester {

	private double[][] Array = new double[][] {{3.0,6.0,8.0},{5.0,15.0,14.0},{12.0,17.0,10.0}};
	private double[][] A = new double[][] {{2.0,3.0,1.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
	private double[][] B = new double[][] {{1.0,3.0,7.0},{1.0,10.0,8.0},{5.0,9.0,1.0}};
	// The Geo matrix holds a geometric sequence with a = 5 and r = 3
	private double[][] Geo = new double[][] {{5.0,405.0,32805.0},{15.0,1215.0,98415.0},{45.0,3645.0,295245.0},{135.0,10935.0,885735.0}}; 
	private double[][] Scalar = new double[][]{{4.0,6.0,2.0},{8.0,10.0,12.0},{14.0,16.0,18.0}};
	
	@Test
	public void testMatrixSum() {
    assertTrue("The sum of matrices are correct",Arrays.deepEquals(Array,AlgebraVector.matrixSum(A,B)));
	}
	
	@Test
	public void testGeometricMatrix() {
    assertTrue("The geometric matrix is correct",Arrays.deepEquals(Geo,AlgebraVector.geometricMatrix(4,3,5.0,3.0)));	
	}
		
	@Test
	public void testScalarMult() {
    assertTrue("The Scalar multiplication is correct",Arrays.deepEquals(Scalar,AlgebraVector.scalarMult(A,2.0)));	
	}

}
