package com.modthemod.api.base;

import com.modthemod.api.entity.Entity;

/**
 * Initiates an entity. Made in my bikeshed.
 */
public interface Initiator {
	/**
	 * Initiates the entity.
	 * 
	 * @param entity
	 *            The {@link Entity} that must go through an initiation
	 *            ceremony.
	 */
	public void initiate(Entity entity);
}
