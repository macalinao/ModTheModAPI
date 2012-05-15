package com.modthemod.api.base;

import java.util.Map;

import com.modthemod.api.ModTheMod;
import com.modthemod.api.event.EventListener;
import com.modthemod.api.event.EventType;

/**
 * Represents a base of an {@link Entity}.
 * 
 * <p>
 * Bases are immutable. The only thing that is "changed" with bases are the
 * event listeners, which can be added or removed at will.
 * </p>
 */
public class Base {
	/**
	 * The name of the base.
	 */
	private final String name;

	/**
	 * The Map containing the properties of the base. Immutable.
	 */
	private final Map<String, Property> properties;

	/**
	 * Creates a new {@link Base} with the given name.
	 * 
	 * <p>
	 * Please do not use this constructor.
	 * 
	 * Instead, use {@link BaseBuilder#build}.
	 * </p>
	 * 
	 * @param name
	 *            The name of the {@link Base}.
	 * @param properties
	 *            The properties of the {@link Base}.
	 */
	Base(String name, Map<String, Property> properties) {
		this.name = name;
		this.properties = properties;
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
