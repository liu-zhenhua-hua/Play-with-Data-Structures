/*
* @Author: Liu Zhenhua
* @Date:   2020-02-07 11:58:52
* @Last Modified by:   Liu Zhenhua
* @Last Modified time: 2020-02-07 14:08:25
*/
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
		size ++;
	}


	public int getSize(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	/*
		Add Elements in Binary Search Tree.
	*/
	public void add(E e){
        root = add(root, e);
    }


    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if(e.compareTo(node.e) > 0)
            node.right = add(node.right, e);

        return node;
    }


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

}