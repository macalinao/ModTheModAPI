package com.modthemod.api;

import com.modthemod.api.base.Base;
import com.modthemod.api.event.Event;

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
	 * @param base The {@link Base} to register.
	 */
	public void registerBase(Base base);
	
	/**
	 * Registers an {@link Event} with the game.
	 * 
	 * @param event The {@link Event} to register.
	 */
	public void registerEvent(Event event);
}
