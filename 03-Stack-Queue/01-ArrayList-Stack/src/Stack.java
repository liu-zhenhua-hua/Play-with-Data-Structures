/*
* @Author: Tony Liu
* @Date:   2020-02-03 17:23:49
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-03 17:24:54
*/

public interface Stack<E>{

	int getSize();
	boolean isEmpty();
	void push(E e);

	E pop();
	E peek();
}