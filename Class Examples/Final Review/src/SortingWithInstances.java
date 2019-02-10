import java.util.ArrayList;

public class SortingWithInstances {
	public static void main(String[] args)
	{
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Dog());
		list.add(new Cat());
		
		
		for(Animal a : list)
		{
			if(a instanceof Dog)
				((Dog) a).Bark();
			
			if(a instanceof Cat)
				((Cat) a).Meow();
			
			a.Breath();
		}
	}
}
