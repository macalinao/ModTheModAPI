package com.modthemod.api.event;

import com.modthemod.api.mod.Mod;

/**
 * Represents an Event, or something that has happened in the game.
 */
public interface Event {
	/**
	 * Gets the name of the event.
	 * 
	 * @return The name of the event.
	 */
	public String getName();

	/**
	 * Gets the mod that this event is associated with.
	 * 
	 * @return The mod the event is associated with.
	 */
	public Mod getMod();
}
