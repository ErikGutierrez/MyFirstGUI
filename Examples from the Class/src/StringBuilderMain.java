/*public class StringBuilderMain
{
	public static void main(StringBuilder[] args) 
	{
		StringBuilder sentence = new StringBuilder("Pancha plancha con cuatro planchas, con cuantas planchas Pancha plancha");
		String searchKey = "plancha";
		StringBuilder sentenceReplace = sentence.replace(searchKey, searchKey.toUpperCase());
		
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
		count = 0;
		nextIndex = 0;
		while(nextIndex >= 0)
		{
			nextIndex = sentence.indexOf(searchKey, nextIndex);
			if(nextIndex >= 0)
			{
				sentence = sentence.replace(nextIndex, nextIndex+searchKey.length(), searchKey.toUpperCase());
				count++;
				nextIndex += "plancha".length();
			}
		}
	
	}
}
*/