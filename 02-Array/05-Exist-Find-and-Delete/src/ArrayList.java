/*
* @Author: Tony Liu 
* @Date:   2020-01-31 15:02:24
* @Modified by:   Tony Liu
* @Last Modified time: 2020-01-31 17:02:50
*
* In this Program File, we add exist(), delete(),find() functionality 
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

	/*
		Checking the ArrayList contains 
		the element e existing or not.
	*/

	public boolean exists(int e){
		for(int i=0; i<size;i++){
			if(elementsContainer[i] == e)
				return true;
		}

		return false;
	}


	/*
		To return the index of Element e
		otherwise return -1;
	*/
	public int find(int e){
		for(int i=0;i<size;i++){
			if(elementsContainer[i] == e)
				return i;
		}
		return -1;
	}


	/*
		remove the element of index,
		and return the element 
	*/

	public int delete(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("delete failed, invalid index, please try again");

		int removedElement = elementsContainer[index];
		for(int i=index+1;i<size;i++)
			elementsContainer[i-1] = elementsContainer[i];

		size--;
		return removedElement;


	}	


	/*
		remove the Element, return the removed element
	*/
	public int deleteFirst(){
		return delete(0);
	}


	public int deleteLast(){
		return delete(size-1);
	}


	public void deleteElement(int e){
		int index = find(e);
		if(index != -1)
			delete(index);
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
