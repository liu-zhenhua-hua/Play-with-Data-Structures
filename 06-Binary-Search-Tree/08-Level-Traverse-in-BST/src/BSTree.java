/*
* @Author: Tony Liu
* @Date:   2020-02-07 15:30:38
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-07 16:14:23
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


	public boolean contains(E e){
		return contains(root,e);
	}


	private boolean contains(Node node,E e){
		if(node == null)
			return false;

		if(e.comparaTo(node.e) == 0)
			return true;
		else if(e.comparaTo(node.e) < 0)
			return contains(node.left,e);
		else
			return contains(node.right,e);

	}


	public void preOrder(){
		preOrder(root);
	}

	private void preOrder(Node node){
		if(node == null)
			return null;

		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);

	}

	public void nonRecursivePreOrder(){
		if(root == null)
			return

		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node cur = stack.pop();
			System.out.println(node.e);


			if(cur.right != null)
				stack.push(cur.right);
			if(cur.left != null)
				stack.push(cur.left);

		}


	}


	public void inOrder(){
		inOrder(root);
	}


	private void inOrder(Node node){
		if(node == null)
			return;

		inOrder(node.left);
		System.out.println(node.e);
		inOrder(node.right);

	}


	public void postOrder(){
        postOrder(root);
    }


	private void postOrder(Node node){
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }


    public void levelTraverseOrder(){

    	if(root == null)
    		return;

    	Queue<Node> q = new Queue<>();
    	q.add(root);
    	while(!q.isEmpty()){
    		Node cur = q.remove();
    		System.out.println(cur.e);


    		if(cur.left != null)
    			q.add(cur.left);
    		if(cur.right != null)
    			a.add(cur.right);


    	}



    }



}