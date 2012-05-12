package com.modthemod.api.event;

public interface EventManager {
	/**
	 * Gets the {@link EventType} corresponding with the given name.
	 * 
	 * @param name
	 *            The name of the {@link EventType}.
	 * @return The {@link EventType} corresponding with the given name.
	 */
	public EventType getEvent(String name);
}
