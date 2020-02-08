/*
* @Author: Tony Liu
* @Date:   2020-02-08 15:27:23
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-08 16:09:33
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		Adding Elements into the Binary Search Tree.
	*/
	public void add(E e){
		root = add(root,e);
	}

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
            return;

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }



    public void nonRecursivePreOrder(){
    	if(root == null)
    		return;

    	Stack<Node> stack = new Stack<>();
    	stack.push(root);
    	while(!stack.isEmpty()){
    		Node cur = stack.pop();
    		System.out.println(cur.e);

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


    public void levelOrder(){

        if(root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.remove();
            System.out.println(cur.e);

            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
    }


    public E miniMum(){
    	if(size == 0)
    		throw new IllegalArgumentException("Binary Search Tree is Empty !");

    	Node miniNode = miniMum(root);
    	return miniNode.e;
    }


    private Node miniMum(Node node){
    	if(node.left == null)
    		return node;

    	return miniMum(node.left);
    }



    public E maxiMum(){
    	if(size == 0)
    		throw new IllegalArgumentException("Binary Search Tree is Empty !");

    	Node maxiNode = maxiMum(root);
    	return maxiNode.e;
    }


    private Node maxiMum(Node node){
    	if(node.right == null)
    		return node;

    	return maxiMum(node.right);
    }


    /*
		removing the mini Element from BST
		and return it
    */
    public E removeMin(){
    	E remElement = miniMum();
    	root = removeMin(root);
    	return remElement;
    }

    private Node removeMin(Node node){

    	if(node.left == null){
    		Node rightNode = node.right;
    		node.right = null;
    		size--;
    		return rightNode;
    	}

    	node.left = removeMin(node.left);
    	return node;

    }



    public E removeMax(){
        E remElement = maxiMum();
        root = removeMax(root);
        return remElement;
    }


    private Node removeMax(Node node){

        if(node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }

        node.right = removeMax(node.right);
        return node;
    }

    /*
		remove Element from Binary Search Tree.
    */
    public void remove(E e){
        root = remove(root, e);
    }


    private Node remove(Node node,E e){
    	
    }











}