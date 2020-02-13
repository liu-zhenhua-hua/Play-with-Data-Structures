/*
* @Author: Tony Liu
* @Date:   2020-02-12 21:19:24
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-12 21:19:45
*/

public interface Queue<E>{
	int getSize();
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}