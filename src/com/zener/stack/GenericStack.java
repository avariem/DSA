package com.zener.stack;

public class GenericStack {
	
	Object[] stack = null;
	int top=0;
	public GenericStack(int capacity) {
		stack = new Object[capacity];
	}
	
	public void push(Object o) {
		stack[top++] = o;
	}
	
	public Object pop() {
		Object o = null;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			o = stack[--top];
			stack[top] = null;
		}
		return o;
	}
	
	public Object peek() {
		Object o = null;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			o = stack[top-1];
		}
		return o;
	}

	private boolean isEmpty() {
		
		return top ==0;
	}
	
	public void printStack() {
		
	}
	
	public static void main(String[] args) {
		
	}

}
