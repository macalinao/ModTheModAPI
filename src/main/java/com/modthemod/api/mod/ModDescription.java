package com.modthemod.api.mod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.gson.Gson;

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
	 * The authors to the mod. These are not as important as the main author.
	 */
	private String[] authors;

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
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
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

	/**
	 * Loads a {@link ModDescription} from its file.
	 * 
	 * @param file
	 *            The file.
	 * @return The {@link ModDescription}
	 * @throws IOException
	 *             If the file isn't loaded correctly.
	 */
	public static ModDescription load(File file) throws IOException {
		int ch;
		StringBuilder json = new StringBuilder("");

		FileInputStream fin = new FileInputStream(file);

		while ((ch = fin.read()) != -1) {
			json.append((char) ch);
		}

		fin.close();

		return load(json.toString());
	}

	/**
	 * Loads a {@link ModDescription} from its JSON representation.
	 * 
	 * @param json
	 *            The JSON representation.
	 * @return The {@link ModDescription}.
	 */
	public static ModDescription load(String json) {
		ModDescription description = (new Gson()).fromJson(json,
				ModDescription.class);

		return description;
	}
}
