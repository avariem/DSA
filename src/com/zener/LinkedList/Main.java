package com.zener.LinkedList;

import com.zener.generic.Employee;

public class Main {

	public static void main(String[] args) {
		
	/*	MyLinkedList empList = new MyLinkedList();
		
		DoubleLinkedList empList2 = new DoubleLinkedList();
		
		ListNode emp1 = new ListNode(new Employee(1,"Joe","William"));
		ListNode emp2 = new ListNode(new Employee(2,"Jack","Roots"));
		ListNode emp3 = new ListNode(new Employee(3,"James","Folding"));
		
		
		  empList.printLinkedList(); 
		  empList.insertAtHead(emp1);
		  //empList.printLinkedList(); 
		  empList.insertAtHead(emp2);
		  empList.insertAtHead(emp3); 
		  empList.printLinkedList();
		  empList.removeFromHead(); 
		  //empList.printLinkedList();
		  empList.insertAtLast(emp3);
		  empList.printLinkedList();
		  empList.removeFromLast(); 
		  empList.printLinkedList();
		 
		
		DoubleListNode joeWil = new DoubleListNode(new Employee(1,"Joe","William"));
		DoubleListNode jacRoot = new DoubleListNode(new Employee(2,"Jack","Roots"));
		DoubleListNode jamFol = new DoubleListNode(new Employee(3,"James","Folding"));
		
		empList2.insertAtHead(joeWil);
		empList2.insertAtHead(jacRoot);
		empList2.insertAtHead(jamFol);
		empList2.printLinkedList();*/
		
		ListNode num1 = new ListNode(1);
		ListNode num2 = new ListNode(2);
		ListNode num3 = new ListNode(7);
		ListNode num4 = new ListNode(10);
		ListNode num5 = new ListNode(1);
		ListNode num6 = new ListNode(17);
		ListNode num7 = new ListNode(3);
		
		MyLinkedList numList = new MyLinkedList();
		
		numList.insertAtHead(num7);
		numList.insertAtHead(num6);
		numList.insertAtHead(num5);
		numList.insertAtHead(num4);
		numList.insertAtHead(num3);
		numList.insertAtHead(num2);
		numList.insertAtHead(num1);
		
		System.out.println(numList.balancedNode());
		
		numList.printLinkedList();
		System.out.println();
		numList.rotate(4);
		
		numList.printLinkedList();
		
		ListNode num8 = new ListNode(8);
		numList.insertAtMiddle(num8, 4);
		System.out.println();
		numList.printLinkedList();
		System.out.println();
		numList.removeFromMiddle(4);
		System.out.println();
		numList.printLinkedList();
		
		

	}

}
