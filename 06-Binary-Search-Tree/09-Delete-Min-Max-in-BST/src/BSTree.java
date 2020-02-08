/*
* @Author: Tony Liu
* @Date:   2020-02-08 11:13:10
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-08 11:21:36
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree<E extends Comparable<E>>{

	private class Node{
		public E e;
		public Node left,right;

		public Node(){
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


	public void add(E e){
		root = add(root,e);
	}


	/*
		internal method to add Element 
		into 
	*/
    private Node add(Node node,E e){
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