package com.modthemod.api.property.primitive;

import com.modthemod.api.property.Property;

/**
 * Represents a {@link Property} made only of itself. (Not compound)
 * 
 * @param T
 *            The type of the {@link Property}'s value.
 */
public abstract class Primitive<T> implements Property {
	/**
	 * The value of the primitive.
	 */
	private final T value;

	public Primitive(T value) {
		this.value = value;
	}

	@Override
	public T getValue() {
		return value;
	}
}
