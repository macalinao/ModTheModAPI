package com.modthemod.api.property;

import java.io.Serializable;

/**
 * Represents a cloneable property containing data.
 * 
 * @param <T>
 *            The type of the {@link Property}.
 */
public final class Property<T> implements Serializable, Cloneable {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 8452618201182051007L;

	/**
	 * The {@link Type} of the {@link Property}.
	 */
	private Type<T> type;

	/**
	 * The value of the {@link Property}.
	 */
	private T value;

	/**
	 * Constructor for a property. <strong>Please use {@link Type#create}
	 * .</strong>
	 * 
	 * @param value
	 *            The value of the {@link Property}.
	 */
	Property(T value) {
		this.value = value;
	}

	/**
	 * Returns true if the {@link Property} is of the given {@link Type}.
	 * 
	 * @param other
	 *            The other {@link Type} to check against.
	 * @return True if the {@link Property} is of the given {@link Type}.
	 */
	public boolean is(Type<?> other) {
		return type.is(other);
	}

	/**
	 * Gets the type
	 * 
	 * @return the type
	 */
	public Type<T> getType() {
		return type;
	}

	/**
	 * Gets the value
	 * 
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
}
