package com.modthemod.api;

import java.util.logging.Logger;

import com.modthemod.api.entity.EntityManager;
import com.modthemod.api.event.EventManager;
import com.modthemod.api.platform.Platform;
import com.modthemod.api.property.TypeManager;

/**
 * Represents the core Game.
 */
public interface Game {
	/**
	 * Gets the platform the game is running on.
	 * 
	 * @return The {@link Platform} of the game.
	 */
	public Platform getPlatform();

	/**
	 * Gets the {@link Logger} of the game.
	 * 
	 * @return The {@link Logger} of the game.
	 */
	public Logger getLogger();

	/**
	 * Gets the {@link EntityManager} of the game.
	 * 
	 * @return The {@link EntityManager} of the game.
	 */
	public EntityManager getEntityManager();

	/**
	 * Gets the {@link EventManager} of the game.
	 * 
	 * @return The {@link EventManager} of the game.
	 */
	public EventManager getEventManager();

	/**
	 * Gets the {@link TypeManager} of the game.
	 * 
	 * @return The {@link TypeManager} of the game.
	 */
	public TypeManager getTypeManager();
}
