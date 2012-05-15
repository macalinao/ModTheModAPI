package com.modthemod.api.base;

import com.modthemod.api.entity.Entity;

/**
 * Initiates an entity. Made in my bikeshed.
 */
public interface Instantiator {
	/**
	 * Instantiates the entity.
	 * 
	 * @param args The arguments that instantiate the entity.
	 */
	public Entity instantiate(Object[] args);
}
