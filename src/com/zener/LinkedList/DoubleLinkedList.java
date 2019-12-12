package com.zener.LinkedList;

public class DoubleLinkedList {
	
	DoubleListNode head;
	DoubleListNode tail;
	
	
	public DoubleLinkedList() {
		head =  new DoubleListNode(null);
		tail =  new DoubleListNode(null);
	}
	
	public void insertAtHead(DoubleListNode node) {
		if(head.data == null) {
			tail = node;
		}
		head.setPrevious(node);
		node.next = head;
		head = node;
	}
	
	public void insertAtLast(DoubleListNode node) {
		if(tail.data == null) {
			head = node;
		}
		node.previous = tail;
		tail.next = node;
		tail = node;
	}
	
	
	public void printLinkedList() {
		if(head.data == null){
			System.out.println("List is empty");
		}else {
			DoubleListNode ptr = head;
			System.out.println(ptr.data);
			while(ptr.next.data!=null) {	
				ptr = ptr.next;
				System.out.println(ptr.data);
				
			}
			//If we are printing only inside while loop, 
			//the last node wont be printed as last.next = null
		}
	}

}
