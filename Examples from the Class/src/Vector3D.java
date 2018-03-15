
//Creating a class that will calculate the values of a vector
public class Vector3D 
{

	//Instance Variables or properties
	private double x;
	private double y;
	private double z;
	
	//Constructors
	public Vector3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	

	//Getters
	public double getX()
	{
		return this.x; //returns the value from outside the parenthesis
	}
	
	
	//Se crearon con Source/generate getters and setters
	public double getZ() 
	{
		return z;
	}
	public double getY() 
	{
		return y;
	}
	
	
	//Setters
	public void setX(double x)
	{
		this.x = x; //Sets the value that is inside the parenthesis to the variable outside the setter
	}
	
	//Estas 2 se crearon con Source/generate getters and setters
	public void setZ(double z) {
		this.z = z;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//Instance Methods
	public double getMagnitude()
	{
		//No suplimos variables porque queremos que TOME los 
		//valores de afuera y devuelva un resultado
		double sumSquares = (this.x * this.x) + (this.y * this.y) + (this.z * this.z);
		double result = Math.sqrt(sumSquares);
		return result;
		
	}

	public Vector3D normalized()
	{
		double newX = this.x / this.getMagnitude();
		double newY = this.y / this.getMagnitude();
		double newZ = this.z / this.getMagnitude();
		Vector3D result = new Vector3D(newX, newY, newZ);
		return result;
	}
}
