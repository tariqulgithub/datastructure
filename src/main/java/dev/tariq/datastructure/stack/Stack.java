/**
 * 
 */
package dev.tariq.datastructure.stack;

import dev.tariq.datastructure.stack.exception.StackEmptyException;
import dev.tariq.datastructure.stack.exception.StackFullException;

/**
 * @author tariqul
 *
 */
public class Stack<T> extends StackAbstraction<T>{
	
	
	public Stack(int size) {
		super(size);
	}
	
	public Stack() {
		/**
		 * default constructor
		 */
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.capacity);
		System.out.println(stack.top);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new StackEmptyException("Underflow");
		}
		return (T)this.container[top--];
	}


	@Override
	public void push(T item) {
		if(isFull()) {
			throw new StackFullException("Overflow");
		}
		this.container[++top] = item;
	}


	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}


	@Override
	public boolean isFull() {
		return this.top == this.capacity -1;
	}

	@Override
	public int size() {
		return this.top + 1;
	}

	@Override
	public T peek() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException("Underflow");
		}
		return  (T)this.container[top];
	}
	

}
