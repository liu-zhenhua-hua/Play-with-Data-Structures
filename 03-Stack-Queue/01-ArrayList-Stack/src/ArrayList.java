/*
* @Author: Tony Liu
* @Date:   2020-02-03 13:09:47
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-03 13:42:27
*/

public class ArrayList<E>{

	private E[] elementContainer;
	private int size;


	public ArrayList(int capacity){
		elementContainer = new int[capacity];
		size = 0;
	}


	public ArrayList(){
		this(15);
	}






	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append(String.format("Array's size %d, Array's capacity : %d n",size,elementContainer.length));
		result.append('[');

		for(int i=0;i<size;i++){
			result.append(elementContainer[i]);
			if(i !=size-1)
				result.append(',');
		}
		result.append(']');
		return result.toString();
	}

}
