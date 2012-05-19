package com.modthemod.api;

public final class ModTheMod {
	/**
	 * The {@link Game} instance.
	 */
	private static Game game = null;

	/**
	 * Private constructor to prevent instantiation.
	 */
	private ModTheMod() {
	}

	/**
	 * Sets the {@link Game} instance.
	 * 
	 * @param game
	 *            The {@link Game} instance.
	 */
	public static void setGame(Game game) {
		if (ModTheMod.game != null) {
			throw new IllegalStateException("'Game' may only be set once!");
		}
		ModTheMod.game = game;
	}

	/**
	 * Gets the {@link Game} instance.
	 * 
	 * @return The {@link Game} instance.
	 */
	public static Game getGame() {
		return ModTheMod.game;
	}
}
