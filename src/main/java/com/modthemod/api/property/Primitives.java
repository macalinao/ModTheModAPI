package com.modthemod.api.property;

/**
 * Container class for well-used {@link Primitive} objects.
 */
public class Primitives {
	/**
	 * The string {@link Primitive}.
	 */
	public static final Primitive<String> STRING = Primitive.define("string",
			String.class);

	/**
	 * The number {@link Primitive}.
	 */
	public static final Primitive<Double> NUMBER = Primitive.define("number",
			Double.class);

	/**
	 * The boolean {@link Primitive}.
	 */
	public static final Primitive<Boolean> BOOLEAN = Primitive.define(
			"boolean", Boolean.class);

	/**
	 * Private constructor to prevent initialization.
	 */
	private Primitives() {
	}
}
