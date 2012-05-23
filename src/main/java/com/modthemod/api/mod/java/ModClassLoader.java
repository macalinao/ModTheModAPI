package com.modthemod.api.mod.java;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * An awesome class loader. It's awesome.
 */
public class ModClassLoader extends URLClassLoader {
	private final JavaModLoader loader;

	private final Map<String, Class<?>> classes = new HashMap<String, Class<?>>();

	public ModClassLoader(final JavaModLoader loader,
			final ClassLoader parent) {
		super(new URL[0], parent);
		this.loader = loader;
	}

	@Override
	protected void addURL(URL url) {
		super.addURL(url);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return findClass(name, true);
	}

	/**
	 * Find a class.
	 * 
	 * @param name
	 * @param checkGlobal
	 * @return
	 * @throws ClassNotFoundException
	 */
	protected Class<?> findClass(String name, boolean checkGlobal)
			throws ClassNotFoundException {
		Class<?> result = classes.get(name);

		if (result == null) {
			if (checkGlobal) {
				result = loader.getClassByName(name);
			}

			if (result == null) {
				result = super.findClass(name);

				if (result != null) {
					loader.setClass(name, result);
				}
			}

			classes.put(name, result);
		}

		return result;
	}

	public Set<String> getClasses() {
		return classes.keySet();
	}
}
