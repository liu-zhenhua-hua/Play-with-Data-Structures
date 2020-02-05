/*
* @Author: Tony Liu
* @Date:   2020-02-05 22:35:46
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-05 22:40:09
*/


public class Solution2{

	public ListNode remveElements(ListNode head, int val){

		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;

		ListNode prev = fakeHead;
		while(prev.next != null){
			if(prev.next.val == val){
				prev.next = prev.next.next;
			}else
				prev = prev.next;
		}

		return fakeHead.next;
	}

}