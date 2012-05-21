package com.modthemod.api.mod.java;

import java.util.logging.Logger;

import com.modthemod.api.mod.Mod;
import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLoader;
import com.modthemod.api.mod.ModLogger;

/**
 * A Java mod.
 */
public class JavaMod implements Mod {
	private ModLoader loader;

	private Logger logger;

	private boolean initialized = false;

	/**
	 * The description for the mod.
	 */
	private ModDescription description;

	/**
	 * Called when the mod is enabled.
	 */
	public void onEnable() {
	}

	/**
	 * Called when the mod is disabled.
	 */
	public void onDisable() {
	}

	@Override
	public String getName() {
		return getDescription().getName();
	}

	@Override
	public ModDescription getDescription() {
		return description;
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	public ModLoader getModLoader() {
		return loader;
	}

	/**
	 * Initializes the mod. Basically gets it ready for being enabled.
	 * 
	 * @param loader
	 */
	void initialize(ModDescription description, ModLoader loader) {
		if (initialized) {
			throw new IllegalStateException("Mod already initialized!");
		}

		this.description = description;
		this.loader = loader;
		this.logger = new ModLogger(this);

		initialized = true;
	}

}
