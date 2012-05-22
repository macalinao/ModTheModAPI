package com.modthemod.api.mod;

/**
 * Represents the order in which this mod will be loaded.
 */
public enum ModLoadOrder {
	/**
	 * Load first. (Internal)
	 */
	CORE,

	/**
	 * Load before the main plugin folder.
	 */
	LOADER,

	/**
	 * Load after startup.
	 */
	STARTUP,

	/**
	 * Load after the worlds are loaded.
	 */
	POSTWORLD;
}
