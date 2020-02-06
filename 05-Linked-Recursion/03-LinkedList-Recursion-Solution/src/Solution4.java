/*
* @Author: Tony Liu
* @Date:   2020-02-06 14:15:55
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-06 14:20:42
*/

public class Solution4{

	public ListNode removeElements(ListNode head, int val){

		if(head == null)
			return head;

		ListNode restNode = removeElements(head.next,val);
		if(head.val == val)
			return restNode;
		else
			head.next = restNode;
			return head;


	}


}