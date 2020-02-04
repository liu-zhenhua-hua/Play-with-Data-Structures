/*
* @Author: Tony Liu
* @Date:   2020-02-04 10:44:15
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-04 11:05:53
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
			throw new IllegalArgumentException("The ArrayList is Full, Adding element is Failed !");

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