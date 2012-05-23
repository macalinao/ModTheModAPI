package com.modthemod.api;

/**
 * Represents an exception relating to ModTheMod.
 */
public class ModTheModException extends Exception {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -180087466549073120L;

	/**
	 * Creates an exception based on another exception.
	 * 
	 * @param message
	 *            The message of the exception.
	 * @param cause
	 *            The cause of the exception.
	 */
	public ModTheModException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Creates a generic exception.
	 * 
	 * @param message
	 *            The message of the exception.
	 */
	public ModTheModException(String message) {
		super(message);
	}

	/**
	 * Create an exception based on another exception.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public ModTheModException(Throwable cause) {
		super(cause);
	}

}
