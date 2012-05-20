package com.modthemod.api.event;

/**
 * Manages {@link Event}s and {@link EventType}s.
 */
public interface EventManager {
	/**
	 * Registers an {@link EventType} with the game.
	 * 
	 * @param event
	 *            The {@link EventType} to register.
	 */
	public void registerEvent(EventType type);

	/**
	 * Gets the {@link EventType} corresponding with the given name.
	 * 
	 * @param name
	 *            The name of the {@link EventType}.
	 * @return The {@link EventType} corresponding with the given name.
	 */
	public EventType getEvent(String name);
}
