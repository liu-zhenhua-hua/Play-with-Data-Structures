/*
* @Author: Tony Liu
* @Date:   2020-02-06 12:29:46
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 13:02:39
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

	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();

		ListNode cur = this;
		while(cur != null){
			result.append(cur.val + "->");
			cur = cur.next;
		}

		result.append("NULL");
		return result.toString();
	}

}