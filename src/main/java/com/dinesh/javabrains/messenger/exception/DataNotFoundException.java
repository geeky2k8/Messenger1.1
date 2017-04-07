package com.dinesh.javabrains.messenger.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9021108185167644684L;

	public DataNotFoundException (String message) {
		super(message);
	}
}
