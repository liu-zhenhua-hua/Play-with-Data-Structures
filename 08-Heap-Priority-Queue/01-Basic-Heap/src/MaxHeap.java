/*
* @Author: Tony Liu
* @Date:   2020-02-10 14:01:57
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-10 18:35:23
*/

public class MaxHeap<E extends Comparable<E>>{

	private ArrayList<E> data;

	public MaxHeap(int capacity){
		data = new ArrayList<>(capacity);
	}

	public MaxHeap(){
		data = new ArrayList<>();
	}


	public int size(){
		return data.getSize();
	}


	public boolean isEmpty(){
		return data.isEmpty();
	}


	private int parent(int index){
		if(index == 0)
			throw new IllegalArgumentException("index-0 doesn't have parent !");
		return (index -1 ) / 2;
	}

	private int leftChild(int index){
		return index * 2 + 1;
	}


	private int rightChild(int index){
		return index * 2 + 2;
	}


	public void add(E e){
		data.addLast(e);
		shiftUp(data.getSize() - 1);
	}


	private void shiftUp(int k){
		while(k > 0 && data.getElement(parent(k)).comparaTo(data.getElement(k)) < 0 ){
			data.swap(k,parent(k));
			k = parent(k);
		}
	} 




}