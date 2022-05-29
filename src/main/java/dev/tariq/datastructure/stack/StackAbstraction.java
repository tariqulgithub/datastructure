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
public abstract class StackAbstraction<T> { 
	
	int capacity;
	
	int top;
	
	Object[] container; 
	
	private static final int DEFAULT_CAPACITY = 10;
	
	protected StackAbstraction() {
		this.capacity = DEFAULT_CAPACITY;
		this.container = new Object [this.capacity]; 
		this.top = -1;
	}
	
	protected StackAbstraction(int capacity) {
		this.capacity = capacity;
		this.container = new Object [this.capacity]; 
		this.top = -1;
	}
	
	public abstract T peek() throws StackEmptyException;
	
	public abstract T pop() throws StackEmptyException;
	
	public abstract int size();
	
	public abstract void push(T item) throws StackFullException;
	
	public abstract boolean isEmpty();
	
	public abstract boolean isFull();
	
	

}
