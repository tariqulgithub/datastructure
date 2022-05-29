/**
 * 
 */
package dev.tariq.datastructure.stack.exception;

import java.io.Serializable;

/**
 * @author tariqul
 *
 */
public class StackFullException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2510617579351587791L;
	
	public StackFullException(String msg) {
		super(msg);
	}
	
	public StackFullException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

}
