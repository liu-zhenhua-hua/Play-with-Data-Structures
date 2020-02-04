/*
* @Author: Tony Liu
* @Date:   2020-02-04 12:45:39
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-04 13:49:26
*/

public class ArrayListQueue<E> implements Queue<E>{

	private ArrayList<E> array;

	public ArrayListQueue(int capacity){
		array = new ArrayList<>(capacity);
	}


	public ArrayListQueue(){
		array = new ArrayList<>();
	}


	@Override
	public int getSize(){
		return array.getSize();
	}


	@Override
	public boolean isEmpty(){
		return array.isEmpty();
	}


	@Override
	public void enqueue(E e){
		return array.addLast(e);
	}


	@Override
	public E dequeue(){
		return array.deleteFirst();
	}


	@Override
	public E getFront(){
		return array.getFirstElement();
	}



	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append("Queue : ");
		result.append("Front [");
		for(int i=0;i<array.getSize();i++){
			result.append(array.getElement[i]);
			if( i != array.getSize()-1)
				result.append(",");
		}
		result.append("] Tail ");
		return result.toString();

	}

}