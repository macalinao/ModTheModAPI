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
	 * Returns true if the {@link Mod} is enabled.
	 * 
	 * @return True if the {@link Mod} is enabled.
	 */
	public boolean isEnabled();

	/**
	 * Called when the mod is loaded.
	 */
	public void onLoad();

	/**
	 * Called when the mod is enabled.
	 */
	public void onEnable();

	/**
	 * Called when the mod is disabled.
	 */
	public void onDisable();

	/**
	 * Gets the {@link ModLoader} that loaded this mod.
	 * 
	 * @return The {@link ModLoader} that loaded this mod.
	 */
	public ModLoader<?> getModLoader();
}
