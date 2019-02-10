/*
 * Exercise where you will be given various smart phones from different
 * brands, models and price points. Your job is to carefully read the
 * methods to be completed in order to help the customer meet his 
 * standards and have a successful purchase.
 */
public class Smartphone {

	private String brand;
	private String model;
	private int price;
	
	public Smartphone(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object c2) {
		if (!(c2 instanceof Smartphone)) {
			throw new RuntimeException("Illegal argument to Smarthphone.equals()");
		}
		Smartphone phone2 = (Smartphone) c2;
		return ((this.getBrand().equals(phone2.getBrand())) &&
				(this.getModel().equals(phone2.getModel())) &&
				(this.getPrice() == phone2.getPrice()));
	}

	@Override
	public String toString() {
		return "Smartphone[" + brand + "," + model + "," + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
	
	// returns the count of smartphones of a the same brand as the target phone in the given stock
	public int countSameBrand(Smartphone[] stock) {
		int count = 0;
		for(int i = 0; i < stock.length; i++)
			if(stock[i].getBrand().equals(brand))
				count++;
		
		return count; //dummy return
	}
	
	// returns true if the target phone is in stock
	public boolean isAvailable(Smartphone[] stock) {
		boolean inStock = false;
		for(int i = 0; i < stock.length; i++)
		{
			if(stock[i].getBrand().equals(brand) && stock[i].getModel().equals(model))
				inStock = true;
		}
		
		return inStock;
	}
	
	// returns the phone in stock with the highest price.
	public static Smartphone highestPrice(Smartphone[] stock) {
		int index = 0;
		int hPrice = 0;
		
		for(int i = 0; i < stock.length; i++)
			if(stock[i].getPrice() > hPrice)
			{
				hPrice = stock[i].getPrice();
				index = i;
			}
		
		return stock[index]; //dummy return
	}
	
	//returns a new array of Smartphones with prices equal or lower than the given budget in the given stock
	//the array to return must have valid contiguous positions(there cannot be void
	//spaces in between).
	public static Smartphone[] phonesInBudget(Smartphone[] stock, int budget) {
		int arraySize = 0;
		boolean inBudget[] = new boolean[stock.length];
		
		for(int i = 0; i<stock.length; i++)
		{
			inBudget[i] = false;
			if(budget >= stock[i].getPrice())
			{
				arraySize++;
				inBudget[i] = true;
			}
		}
		Smartphone[] s = new Smartphone[arraySize];
		
		int count = 0;
		for(int i = 0; i<stock.length; i++)
			if(inBudget[i])
			{
				s[count] = stock[i];
				count++;			
			}
		
		return s; // dummy return
	}
	
	// returns the specific smartphone that is equal to the model that the customer is looking for.
	// returns null if the desired model is not in stock. 
	// Must stop looking as soon as the first Smartphone with the desired model is found.
	public static Smartphone findModel(Smartphone[] stock, String model) {
		int index = 0;
		int count = 0;
		boolean found = false;
		for(Smartphone i : stock)
		{
			if(i.getModel().equals(model))
			{
				index = count;
				found = true;
			}
			count++;
		}
		
		if(found)
			return stock[index];
		else
			return null; // dummy return
	}
	
	//returns true iff there are at least two Smartphone's with the same model in stock. 
	//Must stop as soon as the pair is found.
	//Hint: do not compare the phones in the same position
	//(stock[0].getModel().equals(stock[0].getModel) will yield true but is not corect
	public static boolean twoWithSameModelExist(Smartphone stock[]) {
		boolean found = false;
		for(int i = 0; i < stock.length; i++)
		{
			for(int j = 0; j < stock.length; j++)
			{
				if(i != j)
					found = stock[i].getModel().equals(stock[j].getModel());
				
				if(found)
					break;
			}
			
			if(found) 
				break;
		}
				
				
		return found; // dummy return
	}
	
}
