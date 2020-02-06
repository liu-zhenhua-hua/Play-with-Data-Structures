/*
* @Author: Tony Liu
* @Date:   2020-02-06 22:12:42
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 22:20:39
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

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}


	public void add(E e){
		root = add(root,e);
	}


	private Node add(Node node,E e){
		if(root == null)
			size++;
			return new Node(e);

		if(e.compareTo(node.e) < 0)
			node.left = add(node.left,e);
		else if(e.compareTo(node.e) > 0)
			node.right = add(node.right,e);

		return node;
	}
}