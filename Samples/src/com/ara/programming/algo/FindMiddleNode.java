package com.ara.programming.algo;

public class FindMiddleNode {

	public static void main(String[] args) {
		ListNode head = null;
		for (int i=0;i<3;i++) {
			if (head == null) {
				head = new ListNode(i); //0
			} else {
				ListNode temp = head; //0
				head = new ListNode(i); //1
				head.next = temp; //0
			}
		}

		// print
//		while (head != null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
		
		// list = 2 -> 1 -> 0
		ListNode middle = null;
		ListNode tail = head;
		while (tail != null) {
			if (head.next != null) {
				middle = head.next;
				tail = head.next.next;
			} else {
				break;
			}
			head = head.next;
		}
		System.out.println(middle.data);
	}
}
