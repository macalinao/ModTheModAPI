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
	 * The {@link Initiator} of new entities.
	 */
	private Initiator initiator;

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
	 * Sets the {@link Initiator} of the base.
	 * 
	 * @param initiator
	 *            The {@lnk Initiator} of the base.
	 */
	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}

	/**
	 * Builds a new {@link Base} from the {@link BaseBuilder}.
	 * 
	 * @return A new {@link Base}.
	 */
	@SuppressWarnings("unchecked")
	public Base build() {
		if (initiator == null) {
			initiator = new EmptyInitiator();
		}
		return new Base(name, (HashMap<String, Property>) properties.clone(),
				initiator);
	}
}
