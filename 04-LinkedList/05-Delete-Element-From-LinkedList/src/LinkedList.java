/*
* @Author: Tony Liu
* @Date:   2020-02-02 20:58:44
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 21:01:16
*
* Removed the Element from Linked List
*
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


}