package com.google.www.exceptions;

public class NotFindElement extends AssertionError{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ELEMENT_NOT_FIND = "Can't find the item on the page";

	   public NotFindElement(String message, Throwable testErrorException) {
	      super(message, testErrorException);
	   }
}
