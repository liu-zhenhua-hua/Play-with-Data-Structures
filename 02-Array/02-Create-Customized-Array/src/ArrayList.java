/*
 * Author: Tony Liu
 * Date: 2020-01-29
 * Last Modified by: Tony Liu
 * Description: we created our own Array,
              : the name is same with Java Standard one
              : java.util.ArrayList; 
              : in this Class, we just use Java Foundamental Type int as example.
*/

public class ArrayList{

	private int[] elementsContainer;  //internal container to save the int elements

	private int size; //The Size of ArrayList

	
	public ArrayList(int capacity){
		elementsContainer = new int[capacity];
		size = 0;
	}


	public ArrayList(){
		this(15); //default capacity of the ArrayList without parameter
	}


	/*
		to get Capacity of ArrayList;
	*/
	public int getCapacity(){
		return elementsContainer.length;
	}

	/*
		to get Actual size of ArrayList;
	*/
	public int getSize(){
		return size;
	}

	/*
		the ArrayList is Empty or not
	*/
	public boolean isEmpty(){
		return size == 0;
	}


}

