/*
* @Author: Tony Liu
* @Date:   2020-01-31 13:22:02
* @Last Modified by:   Liu Zhenhua
* @Last Modified time: 2020-01-31 14:02:47
*/


public class ArrayList{

	private int[] elementsContainer;  //internal container to save the int elements

	private int size; //The Size of ArrayList, be attention, size is different with capacity.

	
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


	/*
		Adding Element at last of ArrayList
	*/
	public void addLast(int e){

		add(size,e);

	}


	/*
		Adding Element at First of ArrayList
	*/
	public void addFirst(int e){
		add(0,e);
	}


	/*
		Adding Element in specific position
	*/
	public void add(int index, int e){
		/*
			Checking the ArrayList is full or not
		*/
		if(size == elementsContainer.length)
			throw new IllegalArgumentException("Adding Element operation failed, List is Full");

		if(index<0 || index > size){
			throw new IllegalArgumentException("Adding Failed, index >= 0 index<=size ");
		}

		for(int i=size-1;i>=index;i--){
			elementsContainer[i+1] = elementsContainer[i]; 
		}

		elementsContainer[index] = e;

		size++;

	}

	/*
		get the Element from index;
	*/
	public int getElement(int index){
		if(index < 0 || index >=size){
			throw new IllegalArgumentException("Invalid index value, please try again");
		}

		return elementsContainer[index];
	}


	public void setElement(int index,int e){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Invalid index value, please try again");
		}

		elementsContainer[index] = e;
	}


	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("Array's size := %d, Array's Capacity := %d\n ",size,elementsContainer.length));
		result.append('[');

		for(int i=0;i<size;i++){
			result.append(elementsContainer[i]);
			if(i != size-1)
				result.append(",");
		}
		result.append(']');
		return result.toString();

	}

}
