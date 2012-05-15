package com.modthemod.api.base;

import java.util.HashMap;
import java.util.Map;

public class BaseBuilder {
	/**
	 * The name of the base.
	 */
	private final String name;

	/**
	 * The Map containing the properties of the base.
	 */
	private HashMap<String, Property> properties;

	/**
	 * Creates a new {@link BaseBuilder} with the given name.
	 * 
	 * @param name
	 */
	public BaseBuilder(String name) {
		this.name = name;
		this.properties = new HashMap<String, Property>();
	}

	/**
	 * Sets a property of the base.
	 * 
	 * @param name
	 *            The name of the property.
	 * @param value
	 *            The value of the propery.
	 */
	public void setProperty(String name, Property value) {
		properties.put(name, value);
	}

	/**
	 * Gets the value of a property.
	 * 
	 * @param name
	 *            The name of the property.
	 * @return The {@link Property}.
	 */
	public Property getProperty(String name) {
		return properties.get(name);
	}

	/**
	 * Builds a new {@link Base} from the {@link BaseBuilder}.
	 * 
	 * @return A new {@link Base}.
	 */
	@SuppressWarnings("unchecked")
	public Base build() {
		return new Base(name, ((HashMap<String, Property>) properties.clone()));
	}
}
