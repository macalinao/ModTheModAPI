package com.modthemod.api.util;

import com.modthemod.api.entity.Entity;

/**
 * Represents something that can be called.
 */
public interface Method {
	/**
	 * Calls the {@link Method}.
	 * 
	 * @param subject
	 *            The {@link Entity} subject of the method.
	 * @param args
	 *            The arguments.
	 * @return The result of the calling.
	 */
	public Object call(Entity subject, Object... args);
}
