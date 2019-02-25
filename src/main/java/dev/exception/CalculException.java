package dev.exception;

public class CalculException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalculException(String expression){
		super("L’expression "+expression+" est invalide");
	}
}
