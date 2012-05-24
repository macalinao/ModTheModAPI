package com.modthemod.api.entity;

import com.modthemod.api.ModTheModException;

/**
 * Called when problems occur when instantiating entities of a base.
 */
public class EntityInstantiationException extends ModTheModException {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -6333560574037310672L;

	public EntityInstantiationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EntityInstantiationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EntityInstantiationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
