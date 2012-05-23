package com.modthemod.api.mod;

import com.modthemod.api.ModTheModException;

/**
 * Exception related to a mod not being valid.
 */
public class InvalidModException extends ModTheModException {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -8241064165465288020L;

	/**
	 * {@inheritDoc}
	 */
	public InvalidModException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public InvalidModException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * {@inheritDoc}
	 */
	public InvalidModException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
