package com.modthemod.api.mod.java;

import java.util.logging.Logger;

import com.modthemod.api.mod.Mod;
import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLogger;

/**
 * A Java mod.
 */
public class JavaMod implements Mod<JavaMod> {
	private JavaModLoader loader;

	private boolean enabled = false;

	private Logger logger;

	private boolean initialized = false;

	/**
	 * The description for the mod.
	 */
	private ModDescription description;

	@Override
	public void onLoad() {
	}

	@Override
	public void onEnable() {
	}

	@Override
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

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public JavaModLoader getModLoader() {
		return loader;
	}

	/**
	 * Sets this plugin's enabled status.
	 * 
	 * @param enabled
	 *            True if enabled, false if disabled.
	 */
	protected void setEnabled(final boolean enabled) {
		if (this.enabled != enabled) {
			this.enabled = enabled;
			if (this.enabled) {
				onEnable();
			} else {
				onDisable();
			}
		}
	}

	/**
	 * Initializes the mod. Basically gets it ready for being enabled.
	 * 
	 * @param loader
	 */
	void initialize(ModDescription description, JavaModLoader loader) {
		if (initialized) {
			throw new IllegalStateException("Mod already initialized!");
		}

		this.description = description;
		this.loader = loader;
		this.logger = new ModLogger(this);

		initialized = true;
	}

}
