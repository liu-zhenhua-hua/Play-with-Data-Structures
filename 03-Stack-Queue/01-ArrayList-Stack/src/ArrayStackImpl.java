/*
* @Author: Tony Liu
* @Date:   2020-02-03 17:35:33
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-03 17:50:41
*/


public class ArrayStackImpl<E> implements Stack<E>{

	private ArrayList<E> array;

	/*
		Stack DataStructure base ArrayList
	*/
	public ArrayStackImpl(int capacity){
		array = new ArrayList<>(capacity);
	}


	public ArrayStackImpl(){
		array = new ArrayList<>();
	}



	@Override
	public int getSize(){
		return array.getSize();
	}


	@Override
	public boolean isEmpty(){
		return array.isEmpty();
	}


	


}