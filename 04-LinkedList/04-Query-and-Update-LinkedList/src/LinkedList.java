/*
* @Author: Tony Liu
* @Date:   2020-02-02 20:04:12
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 20:41:22
*/

public class LinkedList<E>{


	private class Node{
		public E e;
		public Node next;


		public Node(E e, Node next){
			this.e = e;
			this.next = next;
		}

		public Node(E e){
			this(e,null);
		}


		public Node(){
			this(null,null);
		}


		@Override
		public String toString(){
			return e.toString();
		}

	}


	private Node fakeHead;
	private int size;



	public LinkedList(){
		fakeHead = new Node();
		size = 0;
	}


	public int getSize(){
		return size;
	}


	public boolean isEmpty(){
		return size == 0;
	}


	public void add(int index, E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add Failed, invalid Argument, please try again");

		Node prev = fakeHead;

		for(int i=0;i<index;i++)
			prev = prev.next;

		prev.next = new Node(e,prev.next);
		size++;

	}


	public void addFirst(E e){
		add(0,e);
	}


	public void addLast(E e){
		add(size,e);
	}



	/**
		get Element from specific index;
	*/
	public E getElement(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Invalid Argument, please try again !");

		Node current = fakeHead.next;
		for(int i=0;i<index;i++)
			current = current.next;

		return current.e;


	}


	public E getFirstElement(){
		return get(0);
	}


	public E getLastElement(){
		return get(size-1);
	}


	public void setElement(int index, E e){
		if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");

        Node current = fakeHead.next;
        for(int i=0;i<index;i++)
        	current = current.next;

        current.e = e;

	}


	/*
		To Check the Element exists in LinkedList
	*/
	public boolean exists(E e){
		Node current = fakeHead.next;
		while(current != null){
			if(current.e.equals(e))
				return true;
			current = current.next;
		}
		return false;
	}



	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();

		for(Node current = fakeHead.next; current != null; current=current.next)
			result.append(current + "->");

		result.append("NULL");

		return result.toString();
	}






}