package arrayIndexList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import indexList.IndexList;

public class ArrayIndexList<E> implements IndexList<E> {
	private static final int INITCAP = 1;
	private static final int CAPTOAR = 1;
	private static final int MAXEMPTYPOS = 2;
	private E[] element;
	private int size;

	public ArrayIndexList() {
		element = (E[]) new Object[INITCAP];
		size = 0;
	}

	public void add(int index, E e) throws IndexOutOfBoundsException {
		if (index < 0 || index > this.size)
			throw new IndexOutOfBoundsException();
		
		if (index == size)
			this.add(e);
		
		else {
			if (this.size == this.element.length) {
				this.changeCapacity(this.element.length);
			}
			for(int i = this.size-1; i >= index; i--)
			{
				this.element[i+1] = this.element[i];
			}
			this.element[index] = e;
			this.size++;
		}
	}

	public void add(E e) {
		if (this.size == this.element.length) {
			this.changeCapacity(this.element.length);
		}
		
		this.element[size] = e;
		this.size++;

	}

	public E get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException();
		else
			return this.element[index];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException();
		else {
			E hold = this.element[index];
			for (int i = index; i < size - 1; i++)
				this.element[i] = this.element[i + 1];
			this.element[size - 1] = null;
			size--;
			return hold;
		}
	}

	public E set(int index, E e) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException();
		else {
			E hold = this.element[index];
			this.element[index] = e;
			return hold;
		}
	}

	public int size() {
		return size;
	}

	// private methods -- YOU CAN NOT MODIFY ANY OF THE FOLLOWING
	// ... ANALYZE AND USE WHEN NEEDED

	// you should be able to decide when and how to use
	// following method.... BUT NEED TO USE THEM WHENEVER
	// NEEDED ---- THIS WILL BE TAKEN INTO CONSIDERATION WHEN GRADING

	private void changeCapacity(int change) {
		int newCapacity = element.length + change;
		E[] newElement = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElement[i] = element[i];
			element[i] = null;
		}
		element = newElement;
	}

	// useful when adding a new element with the add
	// with two parameters....
	private void moveDataOnePositionTR(int low, int sup) {
		// pre: 0 <= low <= sup < (element.length - 1)
		for (int pos = sup; pos >= low; pos--)
			element[pos + 1] = element[pos];
	}

	// useful when removing an element from the list...
	private void moveDataOnePositionTL(int low, int sup) {
		// pre: 0 < low <= sup <= (element.length - 1)
		for (int pos = low; pos <= sup; pos++)
			element[pos - 1] = element[pos];
	}

	// The following two methods are to be implemented as part of an exercise
	public Object[] toArray() {
		Object[] result = new Object[this.size];
		for(int i = 0; i < this.size; i++)
		{
			result[i] = this.element[i];
		}
		
		return result;
	}

	@Override
	public <T1> T1[] toArray(T1[] array) {
		if(this.size < array.length)
		{
			int i = 0;
			while(i < this.size)
			{
				array[i] = (T1) this.element[i];
				i++;
			}
			while(i < array.length)
			{
				array[i] = null;
				i++;
			}
			return array;
		}
		
		else
		{
			
			T1[] result = (T1[]) new Object[this.size];
			
			for(int i = 0; i < this.size; i++)
			{
				result[i] = (T1) this.element[i];
				
			}
			return result;
		}
	}
	
	public int capacity()
	{
		return this.element.length;
	}

	public void clear()
	{
		for(int i = 0; i < this.size; i++)
		{
			this.element[i] = null;
		}
		this.size = 0;
	}
	
	public Object clone()
	{
		E[] clonedArray = (E[]) new Object[this.size];
		for(int i = 0; i < this.size; i++)
		{
			clonedArray[i] = this.element[i];
		}
		return clonedArray;
	}
	
	public List<E> subList(int begining, int ending)
	{
		if(begining < 0 || begining >= this.size || ending <= 0 || ending > this.size)
			throw new IndexOutOfBoundsException();
		
		else
		{
			E[] tinyArray = (E[]) new Object[ending-begining];
			int i = begining;
			int j = 0;
			while(i < ending && j < ending-begining)
			{
				tinyArray[j] = this.element[i];
				j++;
				i++;
			}
			List<E> tinyList = Arrays.asList(tinyArray);
			return tinyList;
		}
		
	}


}
