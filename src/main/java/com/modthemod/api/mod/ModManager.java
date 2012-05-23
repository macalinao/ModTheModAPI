package com.modthemod.api.mod;

import java.util.Set;

/**
 * Manages mods.
 */
public interface ModManager {
	/**
	 * Gets the mod with the given name.
	 * 
	 * @param name
	 * @return
	 */
	public Mod<?> getMod(String name);

	/**
	 * Gets a set of all loaded mods. Excludes loaders.
	 * 
	 * @return A set of all loaded mods.
	 */
	public Set<Mod<?>> getMods();

	/**
	 * Registers a {@link ModLoader} with the {@link ModManager}.
	 * 
	 * @param loader
	 */
	public void registerModLoader(ModLoader<?> loader);

	/**
	 * Enables the given mod.
	 * 
	 * @param mod
	 *            The mod to enable.
	 */
	public <T extends Mod<T>> void enableMod(Mod<T> mod);

	/**
	 * Disables the given mod.
	 * 
	 * @param mod
	 *            The mod to disable.
	 */
	public <T extends Mod<T>> void disableMod(Mod<T> mod);
}
