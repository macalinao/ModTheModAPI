package com.modthemod.api.property;

/**
 * Manages {@link Type}s.
 */
public interface TypeManager {
	/**
	 * Gets a {@link Matcher} from its string representation.
	 * 
	 * @param name
	 *            The name of the {@link Matcher}.
	 * @return The {@link Matcher} corresponding with the given name.
	 */
	public Matcher getMatcher(String name);

	/**
	 * Gets a {@link Type} from its name.
	 * 
	 * @param name
	 *            The name of the {@link Type}.
	 * @return The {@link Type} corresponding with the given name.
	 */
	public Type<?> getType(String name);

	/**
	 * Registers a {@link Primitive} with the {@link TypeManager}.
	 * 
	 * @param primitive
	 *            The {@link Primitive} to register.
	 */
	public void registerPrimitive(Primitive<?> primitive);
}
