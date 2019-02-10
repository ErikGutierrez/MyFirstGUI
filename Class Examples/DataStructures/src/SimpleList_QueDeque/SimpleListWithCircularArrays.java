package SimpleList_QueDeque;

public class SimpleListWithCircularArrays<T> implements SimpleList<T> {
	private static final int CAPACITY = 10;	
	private T[] inventory;
	int first;
	int last;
	int size;
	
	public SimpleListWithCircularArrays() {
		inventory = (T[]) new Object[CAPACITY];
		first = 0;
		last = size = 0;
	}
	
	public SimpleListWithCircularArrays(int capacity) {
		inventory = (T[]) new Object[capacity];
		first = last = size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T first() {
		if(isEmpty())
			return null;
		else
			return inventory[first];
	}

	@Override
	public T last() {
		if(isEmpty())
			return null;
		else
			return inventory[last];
	}

	@Override
	public void addFirst(T e) {
		if(size == inventory.length)
		{
			//System.out.println("Cap was changed");
			this.changeCapacity();
		}
		
		if(isEmpty())
		{
			inventory[0] = e;
			first = 0;
			last = 0;
		}
		else
		{
			first = this.previousPositionV1(first);
			inventory[first] = e;
		}
		size++;
		
	}

	@Override
	public void addLast(T e) {
		if(size == inventory.length)
			this.changeCapacity();
		
		if(isEmpty())
		{
			inventory[0] = e;
			first = 0;
			last = 0;
		}
		else
		{
			last = this.nextPositionV2(last);
			inventory[last] = e;
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if(isEmpty())
			return null;
		
		T value = inventory[first];
		inventory[first] = null;
		first = this.nextPositionV1(first);
		size--;
		return value;
	}

	@Override
	public T removeLast() {
		if(isEmpty())
			return null;
		
		T value = inventory[last];
		inventory[last] = null;
		last = this.previousPositionV1(last);
		size--;
		return value;
	}

	public void print()
	{
		int i = 0;
		int j = first;
		while(i < size)
		{
			i++;
			System.out.print(inventory[j] + ", ");
			j = this.nextPositionV2(j);
		}
		
//		for(int i = 0, j = first; i < size; i++, first = this.nextPositionV1(first))
//			System.out.print(inventory[j] + ", ");

		System.out.println();
	}
	
	private void changeCapacity()
	{
		T[] bigInventory = (T[]) new Object[inventory.length*2];
		int j = first;
		for(int i = 0;  i < this.size; i++)
		{
			bigInventory[i] = inventory[j];
			j = this.nextPositionV2(j);
		}
		
		inventory = bigInventory;
		first = 0;
		last = size - 1;
	}
	
	private int nextPositionV1(int index)
	{
		return (index + 1)%inventory.length;
	}
	
	private int previousPositionV1(int index)
	{
		return (index + inventory.length - 1)%inventory.length;
	}
	
	private int nextPositionV2(int index)
	{
		if(index == inventory.length-1)
			return 0;
		else
			return index + 1;
	}
	
	private int previousPositionV2(int index)
	{
		if(index == 0)
			return inventory.length-1;
		else
			return index-1;
	}
	
	
}
