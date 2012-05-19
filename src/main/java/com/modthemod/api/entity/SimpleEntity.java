package com.modthemod.api.entity;

import java.util.HashMap;
import java.util.Map;

import com.modthemod.api.base.Base;
import com.modthemod.api.property.Type;

/**
 * Represents an entity that acts as a POJO.
 */
public class SimpleEntity extends Entity {
	private Map<String, Type<?>> properties = new HashMap<String, Type<?>>();

	public SimpleEntity(Base base) {
		super(base);
	}

	@Override
	public Type<?> getProperty(String name) {
		return properties.get(name);
	}

	@Override
	public void setProperty(String name, Type<?> value) {
		properties.put(name, value);
	}

}
