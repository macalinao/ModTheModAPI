package com.modthemod.api.property;

import java.io.Serializable;

/**
 * Represents a cloneable property containing data.
 * 
 * @param <T>
 */
public final class Property<T> implements Serializable, Cloneable {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 8452618201182051007L;

	/**
	 * The {@link Type} of the {@link Property}.
	 */
	public Type<T> type;

	/**
	 * The value of the {@link Property}.
	 */
	public T value;

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
}
