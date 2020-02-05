/*
* @Author: Tony Liu
* @Date:   2020-02-05 15:19:31
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-05 15:24:27
*/

public class Solution1{

	public ListNode removeElements(ListNode head, int val){
		while(head != null && head.val == val){
			ListNode remNode = head;
			head = head.next;
			remNode.next = null;
		}

		if(head == null)
			return head;


		ListNode prev = head;
		while(prev.next != null){
			if(prev.next.val == val){
				ListNode remNode = prev.next;
				prev.next = remNode.next;
				remNode.next = null;
			}else
				prev = prev.next;

		}

		return head;
	}


}