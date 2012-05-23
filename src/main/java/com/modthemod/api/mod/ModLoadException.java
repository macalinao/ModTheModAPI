package com.modthemod.api.mod;

import com.modthemod.api.ModTheModException;

/**
 * Exception thrown when an error loading mods occurs.
 */
public class ModLoadException extends ModTheModException {
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -4680055499446330975L;

	public ModLoadException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ModLoadException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ModLoadException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
