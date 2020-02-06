/*
* @Author: Tony Liu
* @Date:   2020-02-05 22:44:54
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-05 22:52:55
*/

public class Solution3{

	public ListNode removeElements(ListNode head, int val){
		while(head != null && head.val == val)
			head = head.next;

		if(head == null)
			return head;

		ListNode prev = head;
		while(prev.next != null){
			if(prev.next.val = val)
				prev.next = prev.next.next;
			else
				prev = prev.next;

		}
		return head;

	}



}