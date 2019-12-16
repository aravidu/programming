package com.ara.programming.algo;

public class ReverseSinglyLinkedList {
	public static void main(String[] args) {
		// 3 2 1
		ListNode head = null;
//		for (int i=0;i<3;i++) {
//			if (i==0) {
//				head = new ListNode();
//				head.val = i+1;
//				head.next = null;
//				continue;
//			}
//			ListNode curr = new ListNode();
//			curr.val = i+1;
//			curr.next = head;
//			head = curr;
//		}
//		
//		while (head != null) {
//			System.out.println(head.val);
//			head = head.next;
//		}

		System.out.println("reversing.. ");

		// 3 -> 2 -> 1
		// 3
		ListNode newHead = null;
		while (head != null) {
			ListNode curr = head;
			curr.next = null;
			newHead = head.next;
		}

	}
}
