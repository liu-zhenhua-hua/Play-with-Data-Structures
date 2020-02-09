/*
* @Author: Tony Liu
* @Date:   2020-02-09 15:01:28
* @Last Modified by:   Liu Zhenhua
* @Last Modified time: 2020-02-09 15:01:39
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