/*
* @Author: Tony Liu
* @Date:   2020-02-06 14:41:00
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 14:42:35
*/


public class Solution5{

	public ListNode removeElements(ListNode head, int val){

		if(head == null)
			return head;

		head.next = removeElements(head.next,val);
		return head.val == val ? head.next : head;

	}


}