package com.modthemod.api.mod.java;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

import com.modthemod.api.Game;
import com.modthemod.api.mod.InvalidModException;
import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLoader;

public class JavaModLoader implements ModLoader<JavaMod> {
	/**
	 * Filters for getting jars.
	 */
	public static final List<Pattern> FILTERS = Arrays.asList(Pattern
			.compile("\\.jar$"));

	/**
	 * The game, which you just lost.
	 */
	private final Game game;

	/**
	 * The classes which are important.
	 */
	protected final Map<String, Class<?>> classes = new HashMap<String, Class<?>>();

	/**
	 * The class loaders we are using.
	 */
	protected final Map<String, ModClassLoader> loaders = new HashMap<String, ModClassLoader>();

	/**
	 * Constructor.
	 * 
	 * @param game
	 *            The game.
	 */
	public JavaModLoader(Game game) {
		this.game = game;
	}

	@Override
	public String getLanguage() {
		return "Java";
	}

	@Override
	public JavaMod loadMod(File file) throws InvalidModException {
		JavaMod result = null;
		ModDescription desc = null;

		desc = loadDescription(file);

		File dataFolder = new File(game.getPlatform().getFileHierarchy()
				.getDataFolder(), desc.getName());

		ModClassLoader classLoader = new ModClassLoader(this, getClass()
				.getClassLoader());
		try {
			URL[] urls = new URL[1];
			urls[0] = file.toURI().toURL();

			Class<?> main = Class.forName(desc.getMain(), true, classLoader);
			Class<? extends JavaMod> mod = main.asSubclass(JavaMod.class);
			Constructor<? extends JavaMod> constructor = mod.getConstructor();

			result = constructor.newInstance();
			result.initialize(dataFolder, desc, this);

		} catch (Exception e) {
			throw new InvalidModException(e);
		}

		loaders.put(desc.getName(), classLoader);
		return result;
	}

	/**
	 * Loads the description of the given plugin file.
	 * 
	 * @param file
	 * @return
	 * @throws InvalidModException
	 */
	private ModDescription loadDescription(File file)
			throws InvalidModException {
		JarFile jar = null;
		InputStream stream = null;
		ModDescription desc = null;
		try {
			jar = new JarFile(file);
			JarEntry entry = jar.getJarEntry("mod.json");

			if (entry == null) {
				throw new InvalidModException("mod.json does not exist!");
			}

			stream = jar.getInputStream(entry);
			desc = ModDescription.load(file);
		} catch (IOException ex) {
			throw new InvalidModException(ex);
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (jar != null) {
				try {
					jar.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return desc;
	}

	@Override
	public List<Pattern> getFileFilters() {
		return FILTERS;
	}

	@Override
	public void enableMod(JavaMod mod) {
		if (!mod.isEnabled()) {
			mod.setEnabled(true);
		}
	}

	@Override
	public void disableMod(JavaMod mod) {
		if (mod.isEnabled()) {
			mod.setEnabled(false);
		}
	}

	public Class<?> getClassByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setClass(String name, Class<?> result) {
		// TODO Auto-generated method stub

	}

}
