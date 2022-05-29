/**
 * 
 */
package dev.tariq.datastructure.stack.exception;

import java.io.Serializable;

/**
 * @author tariqul
 *
 */
public class StackEmptyException extends RuntimeException implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 876657483074310782L;

	public StackEmptyException(String msg) {
		super(msg);
	}
	
	public StackEmptyException(String msg, Throwable throwable) {
		super(msg, throwable);
	}
	

}
