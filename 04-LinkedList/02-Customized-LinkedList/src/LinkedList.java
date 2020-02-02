/*
* @Author: Tony Liu
* @Date:   2020-02-02 13:49:33
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 14:44:55
*/


public class LinkedList<E>{

	/*
		to declare a internal Node for LinkedList
	*/

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


	private Node head;
	private int size;


	/*
		Linked Constructor
	*/
	public LinkedList(){
		head = null;
		size = 0;
	}


	public int getSize(){
		return size;
	}


	public boolean isEmpty(){
		return size == 0;
	}


	public void addFirst(E e){
		head = new Node(e,head);
		size++;
	}



	public void add(int index, E e){
		if(index< 0 || index > size)
			throw new IllegalArgumentException("Add Failed, invalid index, please try again");

		if(index == 0){
			addFirst(e);
		}else{

			Node prev = head;
			for(int i=0;i<index-1; i++){
				prev = prev.next;
			}

			prev.next = new Node(e,prev.next);

			size++;
		}
	}

	/*
		Adding element at the end of LinkedList
	*/
	public void addLast(E e){
		add(size,e);
	}

}