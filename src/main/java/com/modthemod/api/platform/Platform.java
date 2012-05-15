package com.modthemod.api.platform;

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
}
