package com.modthemod.api.event;

import java.util.Map;

import com.modthemod.api.property.Property;

/**
 * Represents an event, or something that has happened in the game.
 */
public final class Event {
	/**
	 * The {@link EventType} of the {@link Event}.
	 */
	private final EventType type;

	/**
	 * The {@link Subject} of the {@link Event}.
	 */
	private final Subject subject;

	/**
	 * The properties of the {@link Event}.
	 */
	private final Map<String, Property<?>> properties;

	/**
	 * Constructor.
	 * 
	 * @param type
	 *            The {@link EventType} of the event.
	 * @param subject
	 *            The {@link Subject} of the event.
	 * @param properties
	 *            The properties of the event.
	 */
	public Event(EventType type, Subject subject,
			Map<String, Property<?>> properties) {
		super();
		this.type = type;
		this.subject = subject;
		this.properties = properties;
	}

	/**
	 * Gets the {@link EventType} of the {@link Event}.
	 * 
	 * @return The {@link EventType} of the {@link Event}.
	 */
	public EventType getType() {
		return type;
	}

	/**
	 * Gets the subject of the event.
	 * 
	 * @return The subject of the event.
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * Gets a {@link Property} of the {@link Event}.
	 * 
	 * @param name
	 *            The name of the {@link Property}.
	 * @return The {@link Property}.
	 */
	public Property<?> getProperty(String name) {
		return properties.get(name);
	}
}
