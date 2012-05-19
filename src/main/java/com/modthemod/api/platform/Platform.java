package com.modthemod.api.platform;

import java.util.logging.Logger;

/**
 * Represents a platform the game is running on, for example, Mojang API,
 * Terasology, or Spout.
 */
public interface Platform {
	/**
	 * Gets the name of the {@link Platform}.
	 * 
	 * @return The name of the {@link Platform}.
	 */
	public String getName();

	/**
	 * Gets the version of the {@link Platform}.
	 * 
	 * @return The version of the {@link Platform}.
	 */
	public String getVersion();

	/**
	 * Gets the {@link Logger} of the platform.
	 * 
	 * @return The {@link Logger} of the platform.
	 */
	public Logger getLogger();
}
