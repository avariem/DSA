package com.zener.LinkedList;

public class DoubleListNode<T> {
	
	T data;
	DoubleListNode<T> next;
	DoubleListNode<T> previous;
	
	public DoubleListNode(T data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public DoubleListNode<T> getNext() {
		return next;
	}
	public void setNext(DoubleListNode<T> next) {
		this.next = next;
	}
	public DoubleListNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleListNode<T> previous) {
		this.previous = previous;
	}
	
	
 
}
