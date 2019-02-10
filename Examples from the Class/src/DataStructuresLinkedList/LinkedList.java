package DataStructuresLinkedList;

import DataStructures.IndexList;

public class LinkedList<G> implements IndexList<G> {
	// Fields: 
	private int size;
	private Node<G> header = new Node<G>(null, null);
	
	//Node Class Decleration:
	private static class Node<G>
	{
		private G inventory;
		private Node<G> reference;
		
		//Constructor for case where there are no input values
		public Node()
		{
			this.inventory = null;
			this.reference = null;
		}
		
		//Constructor for when there are input values
		public Node(G item, Node<G> nextNode)
		{
			this.inventory = item;
			this.reference = nextNode;
		}
		
		//Setter & Getters
		public G getInventory() {
			return this.inventory;
		}
		
		public Node<G> getReference(){
			return this.reference;
		}
		
		public void setInventory(G item) {
			this.inventory = item;
		}
		
		public void setReference(Node<G> newNode) {
			this.reference = newNode;
		}
	}
	
	
	// Constructor	
	public LinkedList()
	{
		this.size = 0;
	}
	
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public G get(int index) throws IndexOutOfBoundsException {
		this.checkIndex(index);
		return this.findNode(index).getInventory();
	}

	@Override
	public G remove(int index) throws IndexOutOfBoundsException {
		if(index == 0)
		{
			Node<G> targetNode = this.header.getReference();
			this.header.setReference(targetNode.getReference());
			G removedValue = targetNode.getInventory();
			targetNode.setInventory(null);
			targetNode.setReference(null);
			this.size--;
			return removedValue;
		}
		else
		{
			Node<G> targetNode = this.findNode(index);
			Node<G> previousNode = this.findNode(index-1);
			Node<G> nextNode = targetNode.getReference();
			
			G removedValue = targetNode.getInventory();
			previousNode.setReference(nextNode);
			targetNode.setInventory(null);
			targetNode.setReference(null);
			this.size--;
			return removedValue;
		}
		
		/******* More optimal version of previous code ********
		Node<G> previousNode = this.findNode(index-1);
		Node<G> nextNode = previousNode.getReference().getReference();
		G removedValue = previousNode.getReference().getInventory();
		previousNode.getReference().setInventory(null);
		previousNode.getReference().setReference(null);
		previousNode.setReference(nextNode);
		******* More optimal version of previous code ********/
		
		
		
	}

	@Override
	public G set(int index, G item) throws IndexOutOfBoundsException {
		this.checkIndex(index);
		G oldValue = this.findNode(index).getInventory();
		Node<G> targetNode = this.findNode(index);
		targetNode.setInventory(item);
		return oldValue;
	}

	@Override
	public void add(int index, G item) throws IndexOutOfBoundsException {
		checkIndex(index);
		
		if(this.isEmpty() || index == this.size)
			this.add(item);
		
		else if(index == 0)
		{
			Node<G> newNode = new Node<G>(item, null);
			newNode.setReference(this.header.getReference());
			this.header.setReference(newNode);
			this.size++;
		}
		else
		{
			Node<G> previousNode = this.findNode(index);
			Node<G> newNode = new Node<G>(item, null);
			newNode.setReference(previousNode.getReference());
			previousNode.setReference(newNode);
			this.size++;
		}
	}

	@Override
	public void add(G item) {
		if(this.isEmpty())
		{
			Node<G> newNode = new Node<G>(item, null);
			this.header.setReference(newNode);
		}
		else
		{
			Node<G> lastNode = this.findNode(this.size-1);
			Node<G> newNode = new Node<G>(item, null);
			lastNode.setReference(newNode);
		}
		this.size++;
	}

	@Override
	public void print() {
		for(int i = 0; i < this.size-1; i++)
			System.out.print(this.findNode(i).getInventory() + ", ");
		
		System.out.println(this.findNode(size-1).getInventory());
		
	}
	
	private Node<G> findNode(int index)
	{
		Node<G> targetNode = this.header.getReference();
		for(int i = 0; i < index; i++)
			targetNode = targetNode.getReference();
		return targetNode;
	}
	private void checkIndex(int index)
	{
		if(this.size < index || index < 0)
			throw new IndexOutOfBoundsException();
	}
}
