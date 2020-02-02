/*
* @Author: Tony Liu
* @Date:   2020-02-02 14:53:31
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 15:05:35
*/

public class LinkedList<E>{

	private class Node{
		public E e;
		public Node next;


		public Node(E e,Node next){
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

	/*
		previous verion, we don't have prev operation for head node.
		so in this file we declare a fakeHead, so each node in the linkedlist
		has the previous operation.
	*/

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


	/*
		adding Element in the specific position 
	*/
	public void add(int index, E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add Failed, illegal index value, please try again !	");

		Node prev = fakeHead;
		for(int i=0;i<index;i++){
			prev = prev.next;
		}

		prev.next = new Node(e,prev.next);
		size++;

	}

	public void addFirst(E e){
		add(0,e);
	}


	public void addLast(E e){
		add(size,e);
	}
}