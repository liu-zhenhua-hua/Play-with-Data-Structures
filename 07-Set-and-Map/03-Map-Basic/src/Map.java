/*
* @Author: Tony Liu
* @Date:   2020-02-09 14:54:50
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-09 14:57:07
*/

public interface Map<K,V>{

	void add(K key, V value);

	V remove(K key);

	boolean contains(K key);

	V get(K key);

	void set(K key, V value);

	int getSize();

	boolean isEmpty();

}