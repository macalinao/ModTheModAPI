package com.modthemod.api.property;

import com.modthemod.api.ModTheMod;

/**
 * Represents a primitive, or a {@link Type} only composed of one value that can
 * have no subtypes.
 * 
 * @param <T>
 *            The type of the value of this {@link Primitive}.
 */
public class Primitive<T> extends Type<T> {
	/**
	 * The name of the {@link Primitive}.
	 */
	private final String name;

	/**
	 * Primitive contructor. <strong>Note: use {@link Primitive#define}.
	 * 
	 * @param name
	 *            The name of the primitive.
	 */
	Primitive(String name) {
		this.name = name.toLowerCase();
	}

	/**
	 * Gets the name of this {@link Primitive}.
	 * 
	 * @return The name of this {@link Primitive}.
	 */
	public String getName() {
		return name;
	}

	@Override
	public boolean is(Type<?> other) {
		return other.equals(this);
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * Defines a new type of {@link Primitive}.
	 * 
	 * @param name
	 *            The name of the {@link Primitive}, /a-z/g.
	 * @param type
	 *            The type of the {@link Primitive}'s value.
	 * @return The {@link Primitive}.
	 */
	public static <C> Primitive<C> define(String name, Class<C> type) {
		name = name.toLowerCase();
		Primitive<C> primitive = new Primitive<C>(name);
		ModTheMod.getGame().getTypeManager().registerPrimitive(primitive);
		return primitive;
	}
}
