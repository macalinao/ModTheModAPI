package com.modthemod.api.mod;

import java.io.File;

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

	public static ModDescription load(File file) {
		return null; // TODO
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the contributors
	 */
	public Contributor[] getContributors() {
		return contributors;
	}

	/**
	 * @return the main
	 */
	public String getMain() {
		return main;
	}

	/**
	 * @return the github
	 */
	public String getGithub() {
		return github;
	}

	/**
	 * @return the dependencies
	 */
	public String[] getDependencies() {
		return dependencies;
	}

	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * @return the engineVersion
	 */
	public String getEngineVersion() {
		return engineVersion;
	}

	public static ModDescription loadFromJson(String json) {
		ModDescription description = new ModDescription();
		// TODO
		return description;
	}

	/**
	 * Represents a contributor to the mod.
	 */
	public class Contributor {
		/**
		 * The name of the contributor.
		 */
		private final String name;

		/**
		 * The email of the contributor.
		 */
		private final String email;

		public Contributor(String name, String email) {
			this.name = name;
			this.email = email;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
	}
}
