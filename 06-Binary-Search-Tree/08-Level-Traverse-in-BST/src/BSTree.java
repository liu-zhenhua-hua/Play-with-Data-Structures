/*
* @Author: Tony Liu
* @Date:   2020-02-07 15:30:38
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-07 15:37:34
*/

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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


	/*
		Add Elements into Binary Search Tree.
	*/
	public void add(E e){
		root = add(root,e);
	}

	private Node add(Node node, E e){
		if(node == null){
			size++;
			return new Node(e);
		}

		if(e.comparaTo(node.e) < 0)
			node.left = add(node.left,e);
		else if(e.comparaTo(node.e) > 0)
			node.right = add(node.right,e);

		return node;
	}
















}
