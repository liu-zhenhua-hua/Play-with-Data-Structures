/*
* @Author: Tony Liu
* @Date:   2020-02-09 14:01:26
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-09 14:01:47
*/

import java.util.ArrayList;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    public LinkedListSet(){
        list = new LinkedList<>();
    }

    @Override
    public int getSize(){
        return list.getSize();
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public void add(E e){
        if(!list.contains(e))
            list.addFirst(e);
    }

    @Override
    public boolean contains(E e){
        return list.contains(e);
    }

    @Override
    public void remove(E e){
        list.removeElement(e);
    }

}