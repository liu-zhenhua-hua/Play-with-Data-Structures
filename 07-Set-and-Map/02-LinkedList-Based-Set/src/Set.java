/*
* @Author: Tony Liu
* @Date:   2020-02-09 11:44:19
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-09 11:46:16
*/

public interface Set<E> {

    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
}