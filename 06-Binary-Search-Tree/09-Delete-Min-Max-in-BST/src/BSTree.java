/*
* @Author: Tony Liu
* @Date:   2020-02-08 11:13:10
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-08 13:22:33
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


    //Checking the Element exists in the Binary Search tree.
    public boolean contains(E e){

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

    /*
    	Binary Search Tree preOrder Recursive implementation
    */
    public void preOrder(){
    	preOrder(root);
    }


    private void preOrder(Node node){
    	if(node == null)
    		return;

    	System.out.println(node.e);
    	preOrder(node.left);
    	preOrder(node.right);
    }




    public void nonRecursivePreOrder(){

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


    
    






}