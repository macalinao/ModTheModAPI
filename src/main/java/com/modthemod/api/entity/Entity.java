package com.modthemod.api.entity;

import com.modthemod.api.base.Base;
import com.modthemod.api.property.Type;

/**
 * Represents an {@link Entity}, or a tangible object in-game.
 */
public abstract class Entity {
	/**
	 * The {@link Base} of the {@link Entity}.
	 */
	private final Base base;

	/**
	 * Creates a new {@link Entity} with the given base.
	 * 
	 * <p>
	 * <strong>NOTE: Please use {@link Base#spawn} instead.</strong>
	 * </p>
	 * 
	 * @param base
	 *            The {@link Base} of the entity.
	 */
	public Entity(Base base) {
		this.base = base;
	}

	/**
	 * Gets the {@link Base} of the {@link Entity.}
	 * 
	 * @return The {@link Base} of the {@link Entity.
	 */
	public Base getBase() {
		return base;
	}

	/**
	 * Gets the value of a property from its name.
	 * 
	 * @param name
	 *            The name of the property.
	 * @return The value of the property as a {@link Type}.
	 */
	public abstract Type<?> getProperty(String name);

	/**
	 * Sets the value of a property from its name.
	 * 
	 * @param name
	 *            The name of the property.
	 * @param value
	 *            The value of the property as a {@link Type}.
	 */
	public abstract void setProperty(String name, Type<?> value);
}
