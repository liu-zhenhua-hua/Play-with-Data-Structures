/*
* @Author: Tony Liu
* @Date:   2020-02-06 15:28:53
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 15:35:17
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
	private size;


	public BSTree(){
		root = null;
		size = 0;
	}

	public int size(){
		return size;
	}


	public boolean isEmpty(){
		return size == 0;
	}

}