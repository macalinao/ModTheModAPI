package com.modthemod.api.event;

/**
 * Represents an event, or something that has happened in the game.
 */
public interface Event {
	/**
	 * Gets the subject of the event.
	 * 
	 * @return The subject of the event.
	 */
	public Subject getSubject();
}
