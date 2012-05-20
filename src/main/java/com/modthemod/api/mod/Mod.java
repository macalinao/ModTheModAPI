package com.modthemod.api.mod;

/**
 * Represents a mod.
 */
public abstract class Mod {
	private final String name;

	protected Mod(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the mod.
	 * 
	 * @return The name of the mod.
	 */
	public String getName() {
		return name;
	}
}
