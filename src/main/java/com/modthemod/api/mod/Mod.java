package com.modthemod.api.mod;

import java.util.logging.Logger;

/**
 * Represents a mod.
 */
public interface Mod {
	/**
	 * Gets the name of this {@link Mod}.
	 * 
	 * @return The name of this {@link Mod}.
	 */
	public String getName();

	/**
	 * Gets the {@link ModDescription} of this mod.
	 * 
	 * @return The {@link ModDescription} of this mod.
	 */
	public ModDescription getDescription();

	/**
	 * Gets the {@link Logger} for this mod.
	 * 
	 * @return The {@link Logger} for this mod.
	 */
	public Logger getLogger();

	/**
	 * Gets the {@link ModLoader} that loaded this {@link Mod}.
	 * 
	 * @return The {@link ModLoader} that loaded this {@link Mod}.
	 */
	public ModLoader getModLoader();
}
