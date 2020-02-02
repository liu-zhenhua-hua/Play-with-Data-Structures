/*
* @Author: Tony Liu
* @Date:   2020-02-02 11:01:59
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-02 11:05:04
*/


public class MainApp{
	public static void main(String[] args){

		ListNode n1 = new ListNode(15,null);
		ListNode n2 = new ListNode(89,n1);
		ListNode n3 = new ListNode(19,n2);
		ListNode n4 = new ListNode(89,n3);

		ListNode linkedList = n3;

		while(linkedList != null){
			System.out.print(linkedList.value + "->");

			linkedList = linkedList.next;
		}
		System.out.println();


	}
}