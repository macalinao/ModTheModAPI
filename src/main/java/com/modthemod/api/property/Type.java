package com.modthemod.api.property;

/**
 * Represents a type of variable or constant.
 * 
 * @param V
 *            The type of the content of the variable.
 */
public interface Type<T> {
	/**
	 * Returns true if the {@link Type} is of the given {@link Type}.
	 * 
	 * @param other
	 *            The other {@link Type} to check against.
	 * @return True if the {@link Type} is of the given {@link Type}.
	 */
	public boolean is(Type<?> other);
}
