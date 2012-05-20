package com.modthemod.api.base;

import java.io.Serializable;
import java.util.Map;

import com.modthemod.api.ModTheMod;
import com.modthemod.api.entity.Entity;
import com.modthemod.api.event.EventListener;
import com.modthemod.api.event.EventType;
import com.modthemod.api.mod.Mod;
import com.modthemod.api.property.Property;
import com.modthemod.api.property.Type;
import com.modthemod.api.util.Method;

/**
 * Represents a base of an {@link Entity}.
 * 
 * <p>
 * Bases are immutable. The only thing that is "changed" with bases are the
 * event listeners, which can be added or removed at will.
 * </p>
 */
public final class Base extends Type<Entity> implements Serializable, Cloneable {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -6874978692908808758L;

	/**
	 * The name of the base.
	 */
	private final String name;

	/**
	 * The {@link Mod} of the base.
	 */
	private final Mod mod;

	/**
	 * The Map containing the properties of the base. Immutable.
	 */
	final Map<String, Property<?>> properties;

	/**
	 * The {@link Map} containing the {@link Method}s of the {@link Base}.
	 * Immutable.
	 */
	final Map<String, Method> methods;

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
	 * @param methods
	 *            The methods of the {@link Base}.
	 * @param instantiator
	 *            The instantiator of the {@link Base}.
	 */
	Base(String name, Map<String, Property<?>> properties,
			Map<String, Method> methods, Instantiator instantiator, Mod mod) {
		this.name = name;
		this.properties = properties;
		this.methods = methods;
		this.instantiator = instantiator;
		this.mod = mod;
	}

	/**
	 * Gets the name of this {@link Base}.
	 * 
	 * @return The name of this {@link Base}.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the {@link Mod} associated with this {@link Base}.
	 * 
	 * @return The {@link Mod} associated with this {@link Base}.
	 */
	public Mod getMod() {
		return mod;
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
		return new BaseBuilder("a"); // TODO think about how this will work
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

	/**
	 * Returns true if the {@link Base} is a child of the other {@link Base}.
	 * 
	 * @param other
	 *            The other {@link Base}.
	 * @return True if the {@link Base} is a child of the other {@link Base}.
	 */
	public boolean isChildOf(Base other) {
		return false; // TODO
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

		Base that = (Base) other;

		// This is not that if that is a superset of this.
		if (!that.equals(this) || !that.isChildOf(this)) {
			return false;
		}

		return true;
	}

}
