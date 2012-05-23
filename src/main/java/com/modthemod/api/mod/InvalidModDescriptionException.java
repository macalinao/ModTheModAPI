package com.modthemod.api.mod;

/**
 * Called when given an invalid mod description.
 */
public class InvalidModDescriptionException extends ModLoadException {
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 1271857580465162317L;

	public InvalidModDescriptionException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidModDescriptionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidModDescriptionException(Throwable cause) {
		super(cause);
		// TODO
	}
}