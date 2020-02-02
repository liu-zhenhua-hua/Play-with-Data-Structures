/*
* @Author: Tony Liu
* @Date:   2020-02-02 20:04:12
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 20:18:16
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


	
















}