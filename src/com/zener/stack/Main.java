package com.zener.stack;
/**
 * Stack implementation using Array
 * Date: 29th May 2019
 * @author ajithmv
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack(10);
		stack.pop();
		Employee e1 = new Employee("Ajith","MV",293);
		Employee e2 = new Employee("Sreejith","MV",294);
		Employee e3 = new Employee("Rajesh","MV",295);
		
		stack.push(e1);
		stack.peek();
		stack.printStack();
		stack.push(e2);
		stack.peek();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.push(e3);
		stack.peek();
		stack.printStack();
		stack.push(e2);
		stack.printStack();
	}
	
	 static class Stack {
		
		public Stack(int capacity){
			super();
			empStack = new Employee[capacity];
		}
		 
		int top = 0;
		Employee[] empStack;
		
		/**
		 * Push method
		 * @param e
		 */
		public void push(Employee e) {
			if(empStack.length == top) {
				System.out.println("\n Cannot insert; Stack is full");
			}else {
				empStack[top++] = e;
				System.out.println("\n Employee "+e.toString()+"pushed to stack");
			}
		}
		
		/**
		 * Pop method
		 * @return
		 */
		public Employee pop() {
			Employee e = null;
			if(isEmpty()) {
				System.out.println("\n Stack is empty");
			}else {
				e = empStack[--top];
				empStack[top] = null;
				System.out.println("\n Employee "+e.toString()+"poped from stack");
			}
			return e;
		}
		
		/**
		 * Peek method
		 * @return
		 */
		public Employee peek() {
			Employee e = null;
			if(isEmpty()) {
				System.out.println("\n Stack is empty");
			}else {
				e = empStack[top-1];
			}
			return e;
		}
		
		/**
		 * Print method
		 */
		public void printStack() {
			if(!isEmpty()) {
				for(int i=top-1;i>=0;i--) {
					System.out.println("\n "+empStack[i].toString() );
				}
			}
		}
		
		private boolean isEmpty() {
			return top == 0;
		}
	}
	
	 static class Employee{
		String firstName;
		String lastName;
		long id;
		
		
		public Employee(String firstName, String lastName, long id) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
	}

}
