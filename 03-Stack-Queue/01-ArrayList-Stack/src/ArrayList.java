/*
* @Author: Tony Liu
* @Date:   2020-02-03 13:09:47
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-03 17:53:37
*/

public class ArrayList<E>{

	private E[] elementContainer;
	private int size;


	public ArrayList(int capacity){
		elementContainer = new int[capacity];
		size = 0;
	}


	public ArrayList(){
		this(15);
	}


	public int getCapacity(){
		return elementContainer.length;
	}

	public boolean isEmpty(){
		return size == 0;
	}


	public int getSize(){
		return size;
	}



	public void add(int index, E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add Failed, invalid index, please try again ");

		if(size == elementContainer.length)
			throw new IllegalArgumentException("ArrayList is Full, Adding Element is Failed ");

		for(int i=size-1;i>=index;i--){
			elementContainer[i+1] = elementContainer[i];
		}

		elementContainer[index] = e;
		size++;

	}


	public void addFirst(E e){
		add(0,e);

	}


	public void addLast(E e){
		add(size,e);
	}



	public E getElement(int index){
		if(index < 0 || index >=size)
			throw new IllegalArgumentException("Invalid index value, please try again !");

		return elementContainer[index];
	}


	public void setElement(int index, E e){
		if(index < 0 || index >=size)
			throw new IllegalArgumentException("Invalid index value, please try again !");

		elementContainer[index] = e;
	}



	public E getLastElement(){
		return getElement(size-1);
	}

	public E getFirstElement(){
		return getElement(0);
	}


	/*
	 Checking element exists in the ArrayList or not.
	*/
	public boolean exists(E e){
		for(int i=0;i<size;i++){
			if(elementContainer[i].equals(e))
				return true;
		}
		return false;
	}

	/*
		return the index value when we find out the element in the ArrayList
		otherwise return -1
	*/
	public int find(E e){
		for(int i=0;i<size;i++){
			if(elementContainer[i].equals(e))
				return i;
		}
		return -1;
	}



	/*
		return deleted element at specific position;
	*/
	public E delete(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("deleted failed, invalid index, please try again !");

		E removedElement = elementContainer[index];
		for(int i=index+1;i<size;i++)
			elementContainer[i-1] = elementContainer[i];

		size--;
		return removedElement;
	}



	public E deleteFirst(){
		return delete(0);
	}


	public E deleteLast(){
		return delete(size-1);
	}


	/*
		delete item from ArrayList
	*/
	public void deleteElement(E e){
		int index = fine(e);
		if(index != -1)
			delete(index);

	}



	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("Array's size %d, Array's capacity : %d n",size,elementContainer.length));
		result.append('[');

		for(int i=0;i<size;i++){
			result.append(elementContainer[i]);
			if(i !=size-1)
				result.append(',');
		}
		result.append(']');
		return result.toString();
	}



	private void allocateSize(int resizeList){
		int oldSize = elementContainer.length;
		int newSize = oldSize + (oldSize >> 1);

		if(newSize - resizeList < 0)
			newSize = resizeList;
		if(newSize - Integer.MAX_VALUE > 0)
			newSize = Integer.MAX_VALUE;

		elementsContainer = Arrays.copyOf(elementData, newCapacity); 

	}



}
