package com.modthemod.api.event;

import com.modthemod.api.mod.Mod;

/**
 * Manages {@link Event}s and {@link EventType}s.
 */
public interface EventManager {
	/**
	 * Registers an {@link EventType} with the game.
	 * 
	 * @param event
	 *            The {@link EventType} to register.
	 * @param mod
	 *            The {@link Mod} to register the {@link EventType} under.
	 */
	public void registerEvent(EventType type, Mod mod);

	/**
	 * Gets the {@link EventType} corresponding with the given name.
	 * 
	 * @param name
	 *            The name of the {@link EventType}.
	 * @return The {@link EventType} corresponding with the given name.
	 */
	public EventType getEvent(String name);
}
