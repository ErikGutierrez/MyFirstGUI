package SimpleList_QueDeque;

public class SimpleListWithNodes<E> implements SimpleList<E> {
	private Node<E> header;
	private Node<E> tailer;
	private int size;

	private class Node<T>
	{
		T element;
		Node<T> next;
		
		public Node()
		{
			element = null;
			next = null;
		}
		
		public Node(T item, Node<T> node)
		{
			element = item;
			next = node;
		}
		
		public T getElement() 
		{ 
			return element; 
		}
		
		public Node<T> getNext()
		{
			return next;
		}
		
		public void setElement(T item)
		{
			element = item;
		}
		
		public void setNext(Node<T> newNext)
		{
			this.next = newNext;
		}
		
		public T nuke()
		{
			T temp = this.element;
			this.element = null;
			this.next = null;
			return temp;
		}
		
	}


	public SimpleListWithNodes() {
		header.setNext(null);
		tailer.setNext(null);
		header.setElement(null);
		tailer.setElement(null);
		size = 0;
	}


	@Override
	public int size() {
		return this.size;
	}


	@Override
	public boolean isEmpty() {
		return size == 0;
	}


	@Override
	public E first() {
		return this.header.getNext().getElement();
	}


	@Override
	public E last() {
		return this.tailer.getNext().getElement();
	}


	@Override
	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e, null);
		
		if(this.isEmpty())
		{
			this.header.setNext(newNode);
			this.tailer.setNext(newNode);
		}
		else
		{
			Node<E> previousFirst = header.getNext();
			this.header.setNext(newNode);
			newNode.setNext(previousFirst);
		}
		size++;
	}


	@Override
	public void addLast(E e) {
		Node<E> newNode = new Node<E>(e, null);
		
		if(this.isEmpty())
		{
			this.header.setNext(newNode);
			this.tailer.setNext(newNode);
		}
		else
		{
			tailer.getNext().setNext(newNode);
			tailer.setNext(newNode);
		}
		size++;
	}


	@Override
	public E removeFirst() {
		E value = this.header.getNext().getElement();
		Node<E> second = this.header.getNext().getNext();
		this.header.getNext().nuke();
		this.header.setNext(second);
		return value;
	}


	@Override
	public E removeLast() {
		E value = this.tailer.getNext().getElement();
		Node<E> newLast = this.header.getNext();
		while(!newLast.getNext().equals(tailer.getNext()))
			newLast = newLast.getNext();
		tailer.getNext().nuke();
		tailer.setNext(newLast);
		return value;
	}
	
	
	public E replace(int index, E item)
	{
		E value;
		
		if(0 > index || size >= index)
			throw new IndexOutOfBoundsException();
		
		else if (index == 0)
		{
			value = header.getNext().getElement();
			header.getNext().setElement(item);
		}
		
		else if(index == size-1)
		{
			value = tailer.getNext().getElement();
			this.tailer.setElement(item);
		}
		
		else
		{
			Node<E> target = this.header.getNext();
			for(int i = 0; i < index; i++)
				target = target.getNext();
			value = target.getElement();
			target.setElement(item);	
		}
		
		return value;
	}
	
	
	public void print()
	{
		Node<E> node = header.getNext();
		for(int i = 0; i < size; i++)
		{
			System.out.print(node.getElement() + ", ");
			node = node.getNext();
		}
		System.out.println(node.getElement());
		
	}
	
	
	
}
