package com.modthemod.api.mod.description;


/**
 * Contains the description for the mod.
 */
public class ModDescription {
	/**
	 * The name of the mod.
	 */
	private String name;

	/**
	 * The version of the mod.
	 */
	private String version;

	/**
	 * The author of the mod.
	 */
	private String author;

	/**
	 * The description of the mod.
	 */
	private String description;

	/**
	 * The {link Contributor}s to the mod.
	 */
	private Contributor[] contributors;

	/**
	 * The main JS file of the mod.
	 */
	private String main;

	/**
	 * Github link to the repository.
	 * 
	 * <p>
	 * Yes, you must use Github. Any other code sharing site is crap. If you
	 * don't put your work on Github, well, that's a different story.
	 * </p>
	 */
	private String github;

	/**
	 * The dependencies of the mod. (mod-version, e.g. core-0.0.1)
	 */
	private String[] dependencies;

	/**
	 * The license of the mod. The name of the license, that is. We don't want
	 * 10 copies of the AGPL floating around in memory.
	 */
	private String license;

	/**
	 * The minimum version of ModTheMod that this is compatible with.
	 */
	private String engineVersion;

	/**
	 * Represents a contributor to the mod.
	 */
	public class Contributor {
		/**
		 * The name of the contributor.
		 */
		private String name;
		
		/**
		 * The email of the contributor.
		 */
		private String email;
	}
}
