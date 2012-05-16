package com.modthemod.api.base;

import java.util.HashMap;
import java.util.Map;

import com.modthemod.api.property.Property;

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
	 * The {@link Instantiator} of new entities.
	 */
	private Instantiator instantiator;

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
	 * Creates a new {@link BaseBuilder} based on the given {@link Base}.
	 * 
	 * @param base
	 *            The {@link Base}
	 */
	public BaseBuilder(Base base) {
		this.name = base.getName();
		this.properties = base.getProperties();
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
	 * Sets the {@link Instantiator} of the base.
	 * 
	 * @param instantiator
	 *            The {@link Instantiator} of the base.
	 */
	public void setInstantiator(Instantiator instantiator) {
		this.instantiator = instantiator;
	}

	/**
	 * Builds a new {@link Base} from the {@link BaseBuilder}.
	 * 
	 * @return A new {@link Base}.
	 */
	@SuppressWarnings("unchecked")
	public Base build() {
		if (instantiator == null) {
			throw new IllegalStateException("No instantiator set!");
		}
		return new Base(name, (HashMap<String, Property>) properties.clone(),
				instantiator);
	}
}
