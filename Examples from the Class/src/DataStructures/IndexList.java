package DataStructures;

public interface IndexList<Generic> {

	int size();
	boolean isEmpty();
	Generic get(int index) throws IndexOutOfBoundsException;
	Generic remove(int index) throws IndexOutOfBoundsException;
	Generic set(int index, Generic item) throws IndexOutOfBoundsException;
	void add(int index, Generic item) throws IndexOutOfBoundsException;
	void add(Generic item);
	public void print();
}
