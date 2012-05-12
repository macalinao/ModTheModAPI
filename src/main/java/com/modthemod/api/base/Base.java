package com.modthemod.api.base;

import java.util.Map;

import com.modthemod.api.ModTheMod;
import com.modthemod.api.event.EventListener;
import com.modthemod.api.event.EventType;

/**
 * Represents a base of an {@link Entity}.
 */
public class Base {
	/**
	 * The name of the base.
	 */
	private String name;

	/**
	 * The Map containing the properties of the base. Immutable.
	 */
	private Map<String, Property> properties;

	/**
	 * Creates a new {@link Base} with the given name.
	 * 
	 * @param name
	 *            The name of the {@link Base}.
	 */
	public Base(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of this {@link Base}.
	 * 
	 * @return The name of this {@link Base}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Adds a property of the base.
	 * 
	 * @param name
	 *            The name of the property.
	 * @param value
	 *            The value of the propery.
	 */
	public void addProperty(String name, Property value) {
		properties.put(name, value);
	}

	/**
	 * Gets the value of a property.
	 * 
	 * @param name
	 *            The name of the property.
	 * @return The {@link Property}.
	 */
	public Property getProperty(String name) {
		return properties.get(name);
	}

	/**
	 * Adds an {@link EventListener} to listen to this {@link Base}.
	 * 
	 * @param eventType
	 *            The name of the {@link EventType} the listener listens to.
	 * @param listener
	 *            The {@link EventListener} to listen.
	 */
	public void addEventListener(String eventType, EventListener listener) {
		EventType type = ModTheMod.getGame().getEventManager()
				.getEvent(eventType);

		if (type == null) {
			throw new IllegalArgumentException("Unknown event type '"
					+ eventType + "' given!");
		}

		addEventListener(type, listener);
	}

	/**
	 * Adds an {@link EventListener} to listen to this {@link Base}.
	 * 
	 * @param eventType
	 *            The {@link EventType} of the listener.
	 * @param listener
	 *            The {@link EventListener} to listen.
	 */
	public void addEventListener(EventType eventType, EventListener listener) {
		eventType.addListener(listener);
	}
}
