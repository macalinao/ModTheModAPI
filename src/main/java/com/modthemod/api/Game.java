package com.modthemod.api;

import com.modthemod.api.base.Base;
import com.modthemod.api.entity.EntityManager;
import com.modthemod.api.event.EventManager;
import com.modthemod.api.event.EventType;

/**
 * Represents the core Game.
 */
public interface Game {
	/**
	 * Gets the platform the game is running on.
	 * 
	 * @return The name of the platform.
	 */
	public String getPlatform();

	/**
	 * Registers a {@link Base} with the game.
	 * 
	 * @param base
	 *            The {@link Base} to register.
	 */
	public void registerBase(Base base);

	/**
	 * Registers an {@link EventType} with the game.
	 * 
	 * @param event
	 *            The {@link EventType} to register.
	 */
	public void registerEvent(EventType event);

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
}
