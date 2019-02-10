package DataStructures;

public class ArrayIndexList<Generic> implements IndexList<Generic> {

	private static final int CAPACITY =	6;
	private Generic items[];	// List of items
	private int size;			// size of the list
	
	// Constructor used if no array capacity value is given
	public ArrayIndexList() 
	{
		items = (Generic[]) new Object[CAPACITY];
		size = 0;
	}
	
	// Constructor used when a capacity value is given
	public ArrayIndexList(int capacity) 
	{
		items = (Generic[]) new Object[capacity];
		size = 0;
	}
	
	
	
	@Override
	public int size() 
	{		
		return this.size;	
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	public Generic get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("The position you entered was not valid");
		}
		
		else 
			return this.items[index];
	}

	@Override
	public Generic remove(int index) throws IndexOutOfBoundsException 
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException(index + " was not a valid index");
		}
		else
		{
			Generic placeholder = this.items[index];
			
			for(int i = index; i < size-1; i++)
			{
				this.items[i] = this.items[i+1];
			}
			
			this.items[size-1] = null;
			this.size--;
			
			return placeholder;
		}
	}

	@Override
	public Generic set(int index, Generic item) throws IndexOutOfBoundsException 
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("The position you entered was not valid");
		}
		else
		{
			Generic placeholder = this.items[index];
			this.items[index] = item;
			return placeholder;
		}
	}

	@Override
	public void add(int index, Generic item) throws IndexOutOfBoundsException {
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("The position you entered was not valid");
		}
		
		else 
			if(index == this.size)
				add(item);
		
		else
		{
			for(int i = size-1; i >= index; i--)
			{
				this.items[i+1] = this.items[i];
			}
			this.items[index] = item;
			this.size++;
		}

	}

	@Override
	public void add(Generic item) 
	{
		if(this.items.length == this.size)
			increaseCapacity();
		
		else
		{
			this.items[size] = item;
			this.size++;
		}

	}

	private void increaseCapacity()
	{
		Generic[] newArray = (Generic[]) new Object[this.size*2];
		for(int i = 0; i < this.size ; i++)
		{
			newArray[i] = this.items[i];
		}
		this.items = newArray;
	}
	
	public void print()
	{
		for(int i = 0; i < size; i++)
			System.out.println(this.items[i]);
		System.out.println();
	}
	
	
	
	
	
	
}
