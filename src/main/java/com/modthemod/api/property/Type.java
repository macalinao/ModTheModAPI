package com.modthemod.api.property;

/**
 * Represents a type of variable or constant.
 * 
 * @param V
 *            The type of the content of the variable.
 */
public abstract class Type<T> {
	/**
	 * Returns true if the {@link Type} is of the given {@link Type}.
	 * 
	 * @param other
	 *            The other {@link Type} to check against.
	 * @return True if the {@link Type} is of the given {@link Type}.
	 */
	public abstract boolean is(Type<?> other);

	/**
	 * Gets a {@link String} representation of this {@link Type}.
	 * 
	 * <p>
	 * This representation, when plugged back into {@link Type#valueOf}, must
	 * return this {@link Type} once again. This should fit the regex of
	 * /a-z/g unless it is a special type.
	 * </p>
	 * 
	 * @return A {@link String} representation of this {@link Type}.
	 */
	public abstract String toString();

	/**
	 * Creates a new {@link Property} with the given value.
	 * 
	 * @param value
	 *            The value of the {@link Property}.
	 * @return The created {@link Property}.
	 */
	public Property<T> create(T value) {
		return new Property<T>(value);
	}

	/**
	 * Returns a {@link Type} from its name.
	 * 
	 * @param name
	 *            The name of the {@link Type}.
	 * @return The {@link Type}.
	 */
	public static Type valueOf(String name) {
		return null; // TODO
	}
}
