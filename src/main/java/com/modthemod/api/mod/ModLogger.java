package com.modthemod.api.mod;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.modthemod.api.ModTheMod;

/**
 * Logger for a mod.
 */
public class ModLogger extends Logger {
	private String prefix;

	/**
	 * Creates a new {@link ModLogger} for the given plugin.
	 * 
	 * @param context
	 */
	public ModLogger(Mod<?> context) {
		super(context.getName(), null);
		prefix = context.getName();

		setParent(ModTheMod.getGame().getLogger());
		setLevel(Level.ALL);
	}

	@Override
	public void log(LogRecord record) {
		record.setMessage(prefix + record.getMessage());
		super.log(record);
	}

}
