/*
* @Author: Tony Liu
* @Date:   2020-02-04 10:44:15
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-04 13:44:48
*
*
* Queue based ArrayList
*/


public class ArrayList<E>{

	private E[] elementContainer;

	private int size;


	public ArrayList(int capacity){
		elementContainer = (E[]) new Object[capacity];
		size = 0;
	}


	public ArrayList(){
		this(15);
	}


	public int getSize(){
		return size;
	}


	public int getCapacity(){
		return elementContainer.length;
	}

	public boolean isEmpty(){
		return size == 0;
	}


	public void add(int index, E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Invalid Argument, please try again !");

		if(size == elementContainer.length)
			//throw new IllegalArgumentException("The ArrayList is Full, Adding element is Failed !");
			allocateSize(elementContainer.length);

		for(int i=size-1;i>=index;i--){
			elementContainer[i+1] = elementContainer[i];
		}

		elementContainer[index] = e;
		size++;

	}

	/*
		Add Element at First Position;
	*/
	public void addFirst(E e){
		add(0,e);
	}

	/*
		Add Element at Last Position;
	*/
	public void addLast(E e){
		add(size,e);
	}



	public E getElement(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Invalid Argument, Please Try it again !");

		return elementContainer[index];

	}


	public void setElement(int index,E e){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Invalid Argument, Please Try it again !");

		elementContainer[index] = e;
	}


	public E getLastElement(){
		return getElement(size-1);
	}

	public E getFirstElement(){
		return getElement(0);
	}



	public boolean exists(E e){
		for(int i=0;i<size;i++){
			if(elementContainer[i].equals(e))
				return true;
		}

		return false;


	}


	/*
		return the index of Element e,
		otherwise return -1;
	*/
	public int find(E e){
		for(int i=0;i<size;i++){
			if(elementContainer[i].equals(e))
				return i;
		}
		return -1;
	}


	/*
		return the deleted element at index of ArrayList;
	*/
	public E delete(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("delete failed, invalid index, please try again");

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



	private void allocateSize(int resizeList){
		int oldSize = elementsContainer.length;
		int newSize = oldSize + (oldSize >> 1);

		if(newSize - resizeList < 0)
			newSize = resizeList;
		if(newSize - Integer.MAX_VALUE > 0)
			newSize = Integer.MAX_VALUE;

		elementsContainer = Arrays.copyOf(elementData, newSize); 



	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("ArrayList's Size : %d, ArrayList's Capapcity : %d\n",size,elementContainer.length));
		result.append('[');
		for(int i =0;i<size;i++){
			result.append(elementContainer[i]);
			if( i != size-1)
				result.append(",");
		}
		result.append(']');
		return result.toString();
	}


}