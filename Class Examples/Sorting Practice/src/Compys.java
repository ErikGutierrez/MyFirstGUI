import java.util.Comparator;

public class Compys<T> implements Comparator<T> {

	
	public int compare(T o1, T o2) {
		int i1 = (Integer) o1;
		int i2 = (Integer) o2;
		
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return 1;
		else
			return 0;
	}

}
