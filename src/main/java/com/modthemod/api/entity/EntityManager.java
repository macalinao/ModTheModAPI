package com.modthemod.api.entity;

import com.modthemod.api.base.Base;

/**
 * Manages entities.
 */
public interface EntityManager {
	/**
	 * Instantiates an {@link Entity}.
	 * 
	 * @param base
	 *            The base of the {@link Entity}.
	 * @param args
	 *            The arguments of the {@link Entity}.
	 * @return The instantiated {@link Entity}.
	 */
	public Entity instantiateEntity(Base base, Object... args);

}
