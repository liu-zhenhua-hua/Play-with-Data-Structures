/*
* @Author: Tony Liu
* @Date:   2020-02-10 13:59:51
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-10 18:27:27
*/
@SuppressWarnings("unchecked") 
public class ArrayList<E>{

	private E[] elementsContainer;  //internal container to save the Generic Data Type

	private int size; //The Size of ArrayList, be attention, size is different with capacity.

	

	public ArrayList(int capacity){
		elementsContainer = (E[]) new Object[capacity]; //Using Object ArrayList
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
	public void addLast(E e){

		add(size,e);

	}


	/*
		Adding Element at First of ArrayList
	*/
	public void addFirst(E e){
		add(0,e);
	}


	/*
		Adding Element in specific position
	*/
	public void add(int index, E e){

		if(index<0 || index > size){
			throw new IllegalArgumentException("Adding Failed, index >= 0 index<=size ");
		}


		/*
			Checking the ArrayList is full or not
		*/
		if(size == elementsContainer.length)
			//throw new IllegalArgumentException("Adding Element operation failed, List is Full");
			// here we execute allocateSize private Method.
			allocateSize(elementsContainer.length);


		for(int i=size-1;i>=index;i--){
			elementsContainer[i+1] = elementsContainer[i]; 
		}

		elementsContainer[index] = e;

		size++;

	}

	/*
		get the Element from index;
	*/
	public E getElement(int index){
		if(index < 0 || index >=size){
			throw new IllegalArgumentException("Invalid index value, please try again");
		}

		return elementsContainer[index];
	}


	public void setElement(int index,E e){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Invalid index value, please try again");
		}

		elementsContainer[index] = e;
	}

	/*
		Checking the ArrayList contains 
		the element e existing or not.
	*/

	public boolean exists(E e){
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
	public int find(E e){
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

	public E delete(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("delete failed, invalid index, please try again");

		E removedElement = elementsContainer[index];
		for(int i=index+1;i<size;i++)
			elementsContainer[i-1] = elementsContainer[i];

		size--;
		return removedElement;


	}	


	/*
		remove the First Element, return the removed element
	*/
	public E deleteFirst(){
		return delete(0);
	}


	public E deleteLast(){
		return delete(size-1);
	}



	/*
		delete the Element from ArrayList
	*/
	public void deleteElement(E e){
		int index = find(e);
		if(index != -1)
			delete(index);
	}


	public void swap(int i,int j){
		if(i<0 || i >= size || j < 0 || j>= size)
			throw new IllegalArgumentException("Index is illegal !");

		E e = elementsContainer[i];
		elementsContainer[i] = elementsContainer[j];
		elementsContainer[j] = e;
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


	private void allocateSize(int resizeList){
		int oldSize = elementsContainer.length;
		int newSize = oldSize + (oldSize >> 1);

		if(newSize - resizeList < 0)
			newSize = resizeList;
		if(newSize - Integer.MAX_VALUE > 0)
			newSize = Integer.MAX_VALUE;

		elementsContainer = Arrays.copyOf(elementData, newCapacity); 

	}

}