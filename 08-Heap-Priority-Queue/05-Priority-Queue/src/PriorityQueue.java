/*
* @Author: Tony Liu
* @Date:   2020-02-12 21:24:38
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-12 21:28:21
*/

public class PriorityQueue<E extends Comparable<E>> implements Queue<E>{

	private MaxHeap<E> maxHeap;

	public PriorityQueue(){
		maxHeap = new MaxHeap<>();
	}
}