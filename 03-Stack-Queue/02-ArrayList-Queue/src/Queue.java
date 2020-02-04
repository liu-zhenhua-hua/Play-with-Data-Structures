/*
* @Author: Tony Liu
* @Date:   2020-02-04 12:42:21
* @Modified by: Tony Liu  
* @Last Modified time: 2020-02-04 12:44:01
*/

public interface Queue<E>{
	int getSize();
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}