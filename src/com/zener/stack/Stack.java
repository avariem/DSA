package com.zener.stack;

public class Stack {
	
	char[] stack = null;
	int top;
	public Stack(int capacity) {
		stack = new char[capacity];
	}
	
	public void push(char c) {
		if(stack.length == top) {
			char[] newStack = new char[top*2];
			stack = newStack;
		}
		stack[top++] = c;
	}
	
	public char pop() {
		char c = '\u0000'; //default null character
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			c = stack[--top];
			stack[top] = '\u0000';
		}
		return c;
	}
	
	public char peek() {
		char c = '\u0000';
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			c = stack[top-1];
		}
		return c;
	}
	
	private boolean isEmpty() {
		return top == 0;
	}
}
