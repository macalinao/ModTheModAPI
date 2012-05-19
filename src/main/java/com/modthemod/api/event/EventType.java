package com.modthemod.api.event;

import java.util.Map;

import com.modthemod.api.mod.Mod;
import com.modthemod.api.property.Property;

/**
 * Represents a type of event.
 */
public final class EventType {
	/**
	 * The name of the {@link EventType}.
	 */
	private final String name;

	/**
	 * The {@link Mod} of the {@link EventType}.
	 */
	private final Mod mod;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            The name of the {@link EventType}.
	 * @param mod
	 *            The {@link Mod} corresponding with this {@link EventType}.
	 */
	public EventType(String name, Mod mod) {
		super();
		this.name = name;
		this.mod = mod;
	}

	/**
	 * Gets the name of the event.
	 * 
	 * @return The name of the event.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the mod that this event is associated with.
	 * 
	 * @return The mod the event is associated with.
	 */
	public Mod getMod() {
		return mod;
	}

	/**
	 * Adds an {@link EventListener} to the event.
	 * 
	 * @param listener
	 *            The {@link EventListener} to add.
	 */
	public void addListener(EventListener listener) {
		// TODO
	}

	/**
	 * Creates an {@link Event} with this {@link EventType}.
	 * 
	 * @param subject
	 *            The {@link Subject} of the {@link Event}.
	 * @param properties
	 *            The properties of the {@link Event}.
	 * @return The created {@link Event}.
	 */
	public Event createEvent(Subject subject,
			Map<String, Property<?>> properties) {
		return new Event(this, subject, properties); // TODO should this call
														// the event?
	}
}
