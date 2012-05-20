package com.modthemod.api.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.modthemod.api.mod.Mod;
import com.modthemod.api.property.Property;
import com.modthemod.api.property.Type;
import com.modthemod.api.util.Method;

public final class BaseBuilder {
	/**
	 * The name of the base.
	 */
	private final String name;

	/**
	 * The Map containing the properties of the base.
	 */
	private final Map<String, Property<?>> properties = new HashMap<String, Property<?>>();

	/**
	 * The Map containing namespaced properties.
	 */
	private final Map<String, Property<?>> namespacedProperties = new HashMap<String, Property<?>>();

	/**
	 * The Map containing the methods of the base.
	 */
	private final Map<String, Method> methods = new HashMap<String, Method>();

	/**
	 * The Map containing namespaced methods.
	 */
	private final Map<String, Method> namespacedMethods = new HashMap<String, Method>();

	/**
	 * The {@link Instantiator} of new entities.
	 */
	private Instantiator instantiator;

	/**
	 * The {@link Base}s of the {@link Base}.
	 */
	private final List<Base> bases = new ArrayList<Base>();

	/**
	 * Creates a new {@link BaseBuilder} with the given name.
	 * 
	 * @param name
	 */
	public BaseBuilder(String name) {
		this.name = name;
	}

	/**
	 * Sets a property of the base.
	 * 
	 * @param name
	 *            The name of the property.
	 * @param value
	 *            The value of the property.
	 * @return this
	 */
	public BaseBuilder setProperty(String name, Property<?> value) {
		properties.put(name, value);
		return this;
	}

	/**
	 * Gets the value of a property.
	 * 
	 * @param name
	 *            The name of the property.
	 * @return The {@link Type}.
	 */
	public Property<?> getProperty(String name) {
		return properties.get(name);
	}

	/**
	 * Adds a {@link Method} to this {@link BaseBuilder}.
	 * 
	 * @param name
	 *            The name of the {@link Method}.
	 * @param method
	 *            The {@link Method} to add.
	 * @return this
	 */
	public BaseBuilder addMethod(String name, Method method) {
		methods.put(name, method);
		return this;
	}

	/**
	 * Gets a {@link Method} of this {@link BaseBuilder}.
	 * 
	 * @param name
	 *            The name of the {@link Method}.
	 * @return The {@link Method}.
	 */
	public Method getMethod(String name) {
		return methods.get(name);
	}

	/**
	 * Sets the {@link Instantiator} of the base.
	 * 
	 * @param instantiator
	 *            The {@link Instantiator} of the base.
	 * @return this
	 */
	public BaseBuilder setInstantiator(Instantiator instantiator) {
		this.instantiator = instantiator;
		return this;
	}

	/**
	 * Adds a parent {@link Base} to the {@link BaseBuilder}.
	 * 
	 * @param parent
	 *            The parent {@link Base} to add.
	 * @return this
	 */
	public BaseBuilder addParent(Base parent) {
		for (Base base : bases) {
			if (parent.isChildOf(base) || parent.equals(base)) {
				return this; // Break; we don't need it.
			}
		}

		bases.add(parent);

		for (Entry<String, Property<?>> entry : parent.properties.entrySet()) {
			namespacedProperties.put(
					parent.getMod().getName() + ":" + parent.getName() + ":"
							+ entry.getKey(), entry.getValue());
		}

		for (Entry<String, Method> entry : parent.methods.entrySet()) {
			namespacedMethods.put(
					parent.getMod().getName() + ":" + parent.getName() + ":"
							+ entry.getKey(), entry.getValue());
		}

		return this;
	}

	/**
	 * Builds a new {@link Base} from the {@link BaseBuilder}.
	 * 
	 * @param mod
	 *            The {@link Mod} to build this {@link Base} with.
	 * @return A new {@link Base}.
	 */
	public Base build(Mod mod) {
		if (instantiator == null) {
			throw new IllegalStateException("No instantiator set!");
		}
		return new Base(name, properties, methods, instantiator, mod);
	}
}
