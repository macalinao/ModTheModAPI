package com.modthemod.api.property;

import com.modthemod.api.ModTheMod;

/**
 * Matches {@link Type}s.
 */
public abstract class Matcher {
	/**
	 * Returns a {@link String} representation of this {@link Matcher}.
	 * 
	 * <p>
	 * This representation, when plugged back into {@link Matcher#valueOf}, must
	 * return this {@link Matcher} once again. This should fit the regex of
	 * /a-z/g unless it is a special type.
	 * </p>
	 * 
	 * @return A {@link String} representation of this {@link Matcher}.
	 */
	public abstract String toString();

	/**
	 * Returns true if the {@link Matcher} matches the given {@link Type}.
	 * 
	 * @param other
	 *            The other {@link Type} to check against.
	 * @return True if the {@link Matcher} is of the given {@link Type}.
	 */
	public abstract boolean is(Type<?> other);

	/**
	 * Gets a {@link Matcher} from its {@link String} representation.
	 * 
	 * @param name
	 *            The name of the {@link Matcher}.
	 * @return The {@link Matcher} corresponding with the {@link String}.
	 */
	public static Matcher valueOf(String name) {
		return ModTheMod.getGame().getTypeManager().getMatcher(name);
	}
}
