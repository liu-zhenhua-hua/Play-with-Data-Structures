/*
* @Author: Tony Liu
* @Date:   2020-02-14 22:50:22
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-15 14:54:03
*/
import java.util.ArrayList;


public class RBTree<K extends Comparable<k>, V>{

	private static final boolean RED = true;
	private static final boolean BLACK = false;


	private class Node{
		public K key;
		public V value;
		public Node left,right;
		public boolean color;

		public Node(K key, V value){
			this.key = key;
			this.value = value;
			left = null;
			right = null;
			color = RED;
		}

	}


	private Node root;
	private int size;


	public RBTree(){
		root = null;
		size = 0;
	}


	public int getSize(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}


	public boolean isRead(Node node){
		if(node == null)
			return BLACK;
		return node.color;
	}



	public void add(K key, V value){
		root = add(root,key,value);
		root.color = BLACK;
	}



	private Node leftRotate(Node node){
		Node x = node.right;

		node.right = x.left;

		x.left = node;
		x.color = node.color;
		node.color = RED;

		return x;
	}










}