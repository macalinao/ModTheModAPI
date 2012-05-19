package com.modthemod.api.base;

import java.io.Serializable;
import java.util.HashMap;

import com.modthemod.api.ModTheMod;
import com.modthemod.api.entity.Entity;
import com.modthemod.api.event.EventListener;
import com.modthemod.api.event.EventType;
import com.modthemod.api.property.Property;
import com.modthemod.api.property.Type;

/**
 * Represents a base of an {@link Entity}.
 * 
 * <p>
 * Bases are immutable. The only thing that is "changed" with bases are the
 * event listeners, which can be added or removed at will.
 * </p>
 */
public class Base extends Type<Entity> implements Serializable, Cloneable {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -6874978692908808758L;

	/**
	 * The name of the base.
	 */
	private final String name;

	/**
	 * The Map containing the properties of the base. Immutable.
	 */
	private final HashMap<String, Property<?>> properties;

	/**
	 * The {@link Instantiator} that runs on entities when they are created.
	 */
	private Instantiator instantiator;

	/**
	 * Creates a new {@link Base}.
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
	Base(String name, HashMap<String, Property<?>> properties,
			Instantiator initiator) {
		this.name = name;
		this.properties = properties;
		this.instantiator = initiator;
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
	 * @return The {@link Type}.
	 */
	public Property<?> getProperty(String name) {
		return properties.get(name);
	}

	/**
	 * Gets a cloned {@link HashMap} of the properties of this {@link Base}.
	 * 
	 * @return A cloned {@link HashMap} of the properties of this {@link Base}.
	 */
	@SuppressWarnings("unchecked")
	public HashMap<String, Property<?>> getProperties() {
		// TODO Deep-clone properties...?
		return (HashMap<String, Property<?>>) properties.clone();
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

	/**
	 * Gets the {@link Instantiator} of the {@link Base}.
	 * 
	 * @return The {@link Instantiator} of the {@link Base}.
	 */
	public Instantiator getInstantiator() {
		return instantiator;
	}

	/**
	 * Creates a new {@link BaseBuilder} based on this {@link Base}.
	 * 
	 * @return A new {@link BaseBuilder} based on this {@link Base}.
	 */
	public BaseBuilder extend() {
		return new BaseBuilder(this);
	}

	/**
	 * Instantiates a new {@link Entity} based on this {@link Base}.
	 * 
	 * @return A new {@link Entity} derived from this {@link Base}.
	 */
	public Entity instantiate() {
		return instantiate(new Object());
	}

	/**
	 * Instantiates a new {@link Entity} based on this {@link Base}.
	 * 
	 * @param args
	 *            The arguments to instantiate the {@link Entity} with.
	 * @return A new {@link Entity} derived from this {@link Base}.
	 */
	public Entity instantiate(Object... args) {
		return ModTheMod.getGame().getEntityManager()
				.instantiateEntity(this, args);
	}

	@Override
	public String toString() {
		return "(" + getName() + ")";
	}

	@Override
	public boolean is(Type<?> other) {
		if (!(other instanceof Base)) {
			return false;
		}

		// TODO no stack overflows!
		Base type = (Base) other;
		if (!other.is(this)) {
			return false;
		}

		return true;
	}

}
