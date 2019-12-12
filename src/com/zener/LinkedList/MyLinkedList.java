package com.zener.LinkedList;

import java.util.HashSet;

public class MyLinkedList {
	
	ListNode head;
	
	public MyLinkedList(){
		head = new ListNode(null);
	}

	public void insertAtHead(ListNode newNode) {
		if(head.data == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAtLast(ListNode newNode) {
		if(head.data == null) {
			head = newNode;
		}else {
			ListNode ptr = head;
			while(ptr.next!=null) {
				ptr = ptr.next;
			}
			ptr.next = newNode;
			newNode.next = null;
		}
	}
	
	public void insertAtMiddle(ListNode newNode, int position) {
		
		if(head.data == null) {
			head = newNode;
		}else {
			int count =1;
			ListNode ptr = head;
			while(count<position-1 && ptr!=null) {
				ptr = ptr.next;
				count ++;
			}
			
			if(ptr == null)
				return;
			ListNode kthNode = ptr;
			ptr = ptr.next;
			kthNode.next = newNode;
			newNode.next = ptr;
			
		}
	}
	
	public ListNode removeFromHead() {
		ListNode temp = null;
		if(head.data == null) {
			System.out.println("List is empty");
		}else {
			temp = head;
			head = head.next;
		}
		System.out.println("Removing"+temp.data);
		return temp;
	}
	
	public ListNode removeFromLast() {
		if(head.data == null) {
			System.out.println("List is empty");
			return null;
		}else {
			ListNode ptr = head;
			while(ptr.next.next!=null) {
				ptr = ptr.next;
				continue;
			}
			ListNode last = ptr.next;
			ptr.next = null;
			System.out.println("Removing"+last.data);
					return last;
		}
		
	}
	
	public ListNode removeFromMiddle(int position) {
		if(head.data == null) {
			System.out.println("List is empty");
			return null;
		}else {
			ListNode ptr = head;
			int count = 1;
			while(count<position-1 && ptr!=null) {
				ptr = ptr.next;
				count++;
			}
			if(ptr == null) {
				System.out.println("List is smaller than "+position);
				return null;
			}
			
			ListNode current = ptr;
			ListNode temp = ptr.next;
			current.next = temp.next;
			System.out.print("Removing"+temp.data);
			return temp;
		}
	}
	
	public void printLinkedList() {
		if(head.data == null){
			System.out.println("List is empty");
		}else {
			ListNode ptr = head;
			System.out.print(ptr.data);
			while(ptr.next!=null) {	
				System.out.print("->");
				ptr = ptr.next;
				System.out.print(ptr.data);
				
			}
			//If we are printing only inside while loop, 
			//the last node wont be printed as last.next = null
		}
	}
	
	public boolean detectLoop(ListNode head) {
		
		HashSet<ListNode> set = new HashSet<>();
		ListNode ptr = head;
		while(ptr!=null) {
			if(set.contains(ptr)) {
				return true;
			}else {
				set.add(ptr);
			}
			ptr = ptr.next;
		}
		return false;
	}
	
	public int balancedNode() {
		
		ListNode slowptr = head;
		ListNode fastptr = head;
		while(slowptr.next!=null) {
			slowptr = slowptr.next;
			int left = 0;
			int right = 0;
			while(fastptr != slowptr) {
				left += (Integer)fastptr.data;
				fastptr = fastptr.next;
			}
			while(fastptr.next!=null) {
				fastptr = fastptr.next;
				right+=(Integer)fastptr.data;
				if(right>left) {
					break;
				}
			}
			if(left == right) {
				return (Integer)slowptr.data;
			}else {
				fastptr = head;
			}
		}
		return -1;
	}
	
	public void rotate(int k) {
		if(k == 0) return;
		ListNode current = head;
		int count = 1;
		while(count<k && current!=null) {
			current = current.next;
			count++;
		}
		
		if(current == null)return;
		
		ListNode kthNode = current;
		
		while(current.next!=null){
			current = current.next;
		}
		
		current.next = head;
		
		head = kthNode.next;
		
		kthNode.next = null;
		
		
	}
}
