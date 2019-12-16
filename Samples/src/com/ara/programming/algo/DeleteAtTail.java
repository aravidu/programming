package com.ara.programming.algo;

public class DeleteAtTail {

	public static void main(String[] args) {
		// list
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode currListHead = deleteAtTail(head);
		
		while (currListHead != null) {
			System.out.println("printing out list after deleting.. ");
			System.out.println(currListHead.data);
			currListHead = currListHead.next;
		}
	}
	
	public static ListNode deleteAtTail(ListNode head) {
		ListNode newHead = head;
		ListNode origHead = head;
		
		// 1 -> null
		if (head.next == null) {
			newHead = null;
			return newHead;
		}
		
		// cur: 1 -> 2 -> 3 -> 4
		// new: 1 -> 2 -> 3 -> 
		while (head.next != null) {
			newHead.next = head.next;
			head = head.next;
			newHead = newHead.next;
		}
		
		
		
		return newHead;
	}

}
