/*
* @Author: Tony Liu
* @Date:   2020-02-09 11:32:10
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-09 11:33:29
*/

public interface Set<E>{

	void add(E e);
	boolean contains(E e);
	void remove(E e);
	int getSize();
	boolean isEmpty();
	
}