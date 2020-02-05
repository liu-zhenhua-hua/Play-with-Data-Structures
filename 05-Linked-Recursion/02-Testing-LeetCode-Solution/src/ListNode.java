/*
* @Author: Tony Liu
* @Date:   2020-02-05 22:04:26
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-05 22:12:24
*/

public class ListNode{

	int val;
	ListNode next;


	public ListNode(int x){
		val = x;
	}


	public ListNode(int[] array){
		if(array == null || array.length == 0)
			throw new IllegalArgumentException("Array can not be empty !");

		this.val = array[0];
		ListNode cur = this;

		for(int i=0;i<array.length;i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}

	}



}
