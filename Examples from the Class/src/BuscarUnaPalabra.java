import java.util.Random;

public class BuscarUnaPalabra
{
	public static void main(String[] args) 
	{
		String sentence = "Pancha plancha con cuatro planchas, con cuantas planchas Pancha plancha";
		String searchKey = "plancha";
		String sentenceReplace = sentence.replace(searchKey, searchKey.toUpperCase());
		
		System.out.println(sentence);
		System.out.println(sentenceReplace);
		int firstOccurrence = sentence.indexOf("plancha");
		System.out.println("First occurrence of 'plancha' is at: " + firstOccurrence);
		
		int secondOccurrence = sentence.indexOf("plancha", firstOccurrence + 1);
		System.out.println("Second occurrence of 'plancha' is at: " + secondOccurrence);
		
		
		int count = 0;
		int nextIndex = 0;
		while(nextIndex >= 0)
		{
			nextIndex = sentence.indexOf(searchKey, nextIndex);
			if(nextIndex >= 0)
			{
				count++;
				nextIndex += "plancha".length();
			}
			
		}
		System.out.println("Sentence contains " + count + " " + searchKey + "(s)");

	}


	public static double quadratic(double a, double b, double c)
	{
		double discriminant = b*b - 4*a*c;
		double result = (-b + Math.sqrt(discriminant))/(2*a);
		return result;
	}
	
}