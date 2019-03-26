package com.ara.programming.ds;

public class EmployeeSinglyList {

	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee e) {
		EmployeeNode node = new EmployeeNode();
		node.setEmployee(e);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public int getSize() {
		return size;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD --> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" --> ");
			current = current.getNext();
		}
	}
}
