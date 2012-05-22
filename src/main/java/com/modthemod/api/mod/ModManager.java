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
	public Mod getMod(String name);

	/**
	 * Gets a set of all loaded mods.
	 * 
	 * @return
	 */
	public Set<Mod> getMods();

	/**
	 * Registers a {@link ModLoader} with the {@link ModManager}.
	 * 
	 * @param loader
	 */
	public void registerModLoader(ModLoader<?> loader);
}
