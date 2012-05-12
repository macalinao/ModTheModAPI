package com.modthemod.api.event;

import com.modthemod.api.mod.Mod;

/**
 * Represents a type of event.
 */
public interface EventType {
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
	
	/**
	 * Adds an {@link EventListener} to the event.
	 * 
	 * @param listener The {@link EventListener} to add.
	 */
	public void addListener(EventListener listener);
}
