package com.modthemod.api.util;

/**
 * Represents something that can be called.
 */
public interface Callable {
	/**
	 * Calls the {@link Callable}.
	 * 
	 * @param args
	 *            The arguments.
	 * @return The result of the calling.
	 */
	public Object call(Object... args);
}
