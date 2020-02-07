/*
* @Author: Tony Liu
* @Date:   2020-02-07 09:25:27
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-07 10:01:38
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
		size++;
	}

	public int getSize(){
		return size;
	}


	public boolean isEmpty(){
		return size == 0;
	}

	/*
		Add Elements into the Binary Search Tree.
	*/
	public void add(E e){
		root = add(root,e);
	}

	/*
		Internal Method to Add Elements into the Binary Search Tree.
	*/
	private Node add(Node node,E e){
		if(node == null){
			size++;
			return new Node(e);
		}

		if(e.compareTo(node.e) < 0)
			node.left = add(node.left,e);
		else if(e.compareTo(node.e) > 0)
			node.right = add(node.right,e);

		return node;
	}



	/*
		Checking the Elements exists in the BST or not
	*/
	public boolean contains(E e){
		return contains(root,e);
	}


	private boolean contains(Node node,E e){
		if(node == null)
			return false;

		if(e.compareTo(node.e) == 0)
			return true;
		else if(e.compareTo(node.e) < 0)
			return contains(node.left,e);
		else
			return contains(node.right,e);
	}


}