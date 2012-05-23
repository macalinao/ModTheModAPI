package com.modthemod.api.mod;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Represents an interface to load {@link Mod}s.
 */
public interface ModLoader<T extends Mod> {
	/**
	 * Gets the language of the mods loaded by this {@link ModLoader}.
	 * 
	 * @return The language of the mods loaded by this {@link ModLoader}.
	 */
	public String getLanguage();

	/**
	 * Loads a {@link Mod} with the given {@link File}.
	 * 
	 * @param file
	 *            The {@link File} to load.
	 * @return The {@link Mod} loaded.
	 */
	public T loadMod(File file) throws InvalidModException;

	/**
	 * Gets a {@link List} of all file filters that match files of this
	 * {@link ModLoader}'s type.
	 * 
	 * @return A {@link List} of all file filters that match files of this
	 *         {@link ModLoader}'s type.
	 */
	public List<Pattern> getFileFilters();

	/**
	 * Enables the {@link Mod}.
	 * 
	 * @param mod
	 *            The {@link Mod} to enable.
	 */
	public void enableMod(T mod);

	/**
	 * Disables the {@link Mod}.
	 * 
	 * @param mod
	 *            The {@link Mod} to disable.
	 */
	public void disableMod(T mod);
}
