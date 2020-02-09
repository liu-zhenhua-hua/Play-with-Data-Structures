/*
* @Author: Tony Liu
* @Date:   2020-02-09 11:34:43
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-09 11:37:14
*/

public class BSTreeSet<E extends Comparable<E>> implements Set<E>{


	private BSTree<E> bstree;

    public BSTreeSet(){
        bstree = new BSTree<>();
    }



    @Override
    public int getSize(){
        return bstree.geSize();
    }


    @Override
    public boolean isEmpty(){
        return bstree.isEmpty();
    }

    @Override
    public void add(E e){
        bstree.add(e);
    }

    @Override
    public boolean contains(E e){
        return bstree.contains(e);
    }

    @Override
    public void remove(E e){
        bstree.remove(e);
    }


}