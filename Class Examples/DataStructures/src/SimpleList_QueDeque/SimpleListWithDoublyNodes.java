package SimpleList_QueDeque;

public class SimpleListWithDoublyNodes<T> implements SimpleList<T> {

	private DNode<T> first;
	private DNode<T> last;
	private int size;

	private class DNode<E>
	{
		E element;
		DNode<E> next;
		DNode<E> previous;
		
		public DNode()
		{
			element = null;
			next = previous = null;
		}
		
		public DNode(E e, DNode<E> newNext, DNode<E> newPrevious)
		{
			element = e;
			next = newNext;
			previous = newPrevious;
		}
		
		public E getElement() {
			return element;
		}
		
		public void setElement(E element) {
			this.element = element;
		}
		
		public DNode<E> getNext() {
			return next;
		}
		
		public void setNext(DNode<E> next) {
			this.next = next;
		}
		
		public DNode<E> getPrevious() {
			return previous;
		}
		
		public void setPrevious(DNode<E> previous) {
			this.previous = previous;
		}
		
		public E nuke()
		{
			E value = element;
			element = null;
			next = previous = null;
			return value;
		}
		
		
	}
	
	public SimpleListWithDoublyNodes() {
		first.setElement(null);
		first.setNext(null);
		first.setPrevious(null);
		first = last;
		size = 0;
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
		return first.getElement();
	}

	@Override
	public T last() {
		return last.getElement();
	}

	@Override
	public void addFirst(T e) {
		if(isEmpty())
		{
			first.setElement(e);
			last = first;
		}
		else
		{
			DNode<T> newFirst = new DNode<T>(e, first, null);
			first = newFirst;
		}
		size++;
	}

	@Override
	public void addLast(T e) {
		if(isEmpty())
		{
			first.setElement(e);
			last = first;
		}
		else
		{
			DNode<T> newLast = new DNode<T>(e, null, last);
			last = newLast;
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if(isEmpty())
			return null;

		else
		{
			T value = first.getElement();
			if(this.isEmpty())
			{
				first.nuke();
				first = last;
			}
			else
			{
				DNode<T> second = first.getNext();
				first.nuke();
				first = second;
			}
			size--;
			return value;
		}
	}

	@Override
	public T removeLast() {
		if(isEmpty())
			return null;
		else
		{
			T value = last.getElement();
			if(this.isEmpty())
			{
				last.nuke();
				last = first;
			}
			else
			{
				DNode<T> newLast = last.getPrevious();
				last.nuke();
				last = newLast;
			}
			size--;
			return value;
		}
	}

	public void print()
	{
		DNode<T> node = first;
		for(int i = 0; i < size; i++)
		{
			System.out.print(node.getElement() + ", ");
			node = node.getNext();
		}
		System.out.println(node.getElement());
		
	}
}
