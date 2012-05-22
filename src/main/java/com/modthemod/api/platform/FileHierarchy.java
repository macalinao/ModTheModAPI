package com.modthemod.api.platform;

import java.io.File;

/**
 * Represents the File hierarchy of the {@link Platform}.
 */
public interface FileHierarchy {
	/**
	 * Gets the folder containing configuration.
	 * 
	 * @return The folder containing configuration.
	 */
	public File getConfigFolder();

	/**
	 * Gets the folder containing data.
	 * 
	 * @return The folder containing data.
	 */
	public File getDataFolder();

	/**
	 * Gets the folder containing loaders. (Mods containing {@link ModLoader}s)
	 * 
	 * @return The folder containing loaders.
	 */
	public File getLoadersFolder();

	/**
	 * Gets the folder containing mods.
	 * 
	 * @return The folder containing mods.
	 */
	public File getModsFolder();
}
