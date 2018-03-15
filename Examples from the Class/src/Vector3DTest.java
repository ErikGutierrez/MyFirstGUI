import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;

class Vector3DTest 
{

	public static double epsilon = 1e-5;
	@Test
	public void testConstructorAndGetters()
	{
		Vector3D v1 = new Vector3D(1.0, 1.0, 1.0);
		assertEquals("Vector 3D has wrong x", 1.0, v1.getX(), epsilon);
		assertEquals("Vector3D has wrong y", 1.0, v1.getY(), epsilon);
		assertEquals("Vector3D has wrong z", 1.0, v1.getZ(), epsilon);
		Vector3D v2 = new Vector3D(1.0/3.0, 0.1, -0.1);
		assertEquals("Vector 3D has wrong x", 1.0/3.0, v2.getX(), epsilon);
		assertEquals("Vector3D has wrong y", 0.1, v2.getY(), epsilon);
		assertEquals("Vector3D has wrong z", -0.1, v2.getZ(), epsilon);
	}
	@Test
	public void testGetMagnitude()
	{
		Vector3D v1 = new Vector3D(1.0, 1.0, 1.0);
		assertEquals("Vector3D has wrong magnitude", Math.sqrt(3), v1.getMagnitude(), epsilon);
	}
}
