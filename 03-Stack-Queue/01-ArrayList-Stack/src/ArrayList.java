/*
* @Author: Tony Liu
* @Date:   2020-02-03 13:09:47
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-03 13:54:32
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

}
