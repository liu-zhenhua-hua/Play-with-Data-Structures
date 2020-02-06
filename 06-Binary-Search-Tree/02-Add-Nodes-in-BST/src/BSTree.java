/*
* @Author: Tony Liu
* @Date:   2020-02-06 19:56:45
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 20:51:07
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

	/*
		Adding Elements into Binary Search Tree
	*/
	public void add(E e){
		if(root == null){
			root = new Node(e);
			size++;
		}else{
			add(root,e);
		}
	}


	private void add(Node node,E e){
		if(e.equals(node.e))
			return;
		else if(e.compareTo(node.e)<0 && node.left == null){
			node.left = new Node(e);
			size++;
			return;
		}
		else if(e.compareTo(node.e) > 0 && node.right == null){
			node.right = new Node(e);
			size++;
			return;
		}

		if(e.compareTo(node.e)<0)
			add(node.left,e);
		else
			add(node.right,e);

	}


}