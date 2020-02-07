/*
* @Author: Tony Liu
* @Date:   2020-02-07 10:14:20
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-07 10:19:47
*/


public class BSTree<E extends Comparable<E>>{

	private class Node{
		public E e;
		public Node left,right;

		public Node(E e){
			this.e = e;
			left = null;
			right = null;
		}
	}


	private Node root;
	private int size;


	public BSTree(){
		root = null;
		size = 0;
	}


	public int getSize(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}



	




}