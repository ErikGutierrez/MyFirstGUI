import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args)
	{
		MyComparator comp = new MyComparator();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hell");
		list.add("hel");
		list.add("he");
		list.add("h");
		list.add("");
		System.out.println(list);
		
		
		int min = list.get(0).length();
		int index = 0;
		
		for(int i = 0; i < list.size() -1; i++)
		{
			// Without comparator //
			int smallest = i;
			
			for(int j = i + 1; j < list.size(); j++)
				if(list.get(smallest).length() > list.get(j).length())
					smallest = j;
			
			String temp = list.get(i);
			list.set(i, list.get(smallest));
			list.set(smallest, temp);
			
			
			// with comparator //
//			if(comp.compare(list.get(i), list.get(i+1)) > 0)
//			{
//				String temp = list.get(i);
//				list.set(i, list.get(i + 1));
//				list.set(i+1, temp);
//			}
		}
		System.out.println(list);
		
		
		
	}
}

class MyComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2)
	{
		if(o1.length() < o2.length())
			return -1;
		
		else if (o1.length() == o2.length())
			return 0;
		
		else
			return 1;
	}
}


