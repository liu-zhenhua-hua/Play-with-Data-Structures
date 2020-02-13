/*
* @Author: Tony Liu
* @Date:   2020-02-12 21:24:38
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-12 21:45:30
*/

public class PriorityQueue<E extends Comparable<E>> implements Queue<E>{

	private MaxHeap<E> maxHeap;

	public PriorityQueue(){
		maxHeap = new MaxHeap<>();
	}


	@Override
	public int getSize(){
		return maxHeap.size();
	}


	@Override
	public boolean isEmpty(){
		return maxHeap.isEmpty();
	}

	@Override
	public E getFront(){
		return maxHeap.findMax();
	}


	@Override
	public void enqueue(E e){
		maxHeap.add(e);
	}

	@Override
	public E dequeue(){
		return maxHeap.extractMax();
	}
}