package com.modthemod.api.entity;

import java.util.HashMap;
import java.util.Map;

import com.modthemod.api.base.Base;
import com.modthemod.api.base.Property;

/**
 * Represents an entity that acts as a POJO.
 */
public class SimpleEntity extends Entity {
	private Map<String, Property> properties = new HashMap<String, Property>();

	public SimpleEntity(Base base) {
		super(base);
	}

	@Override
	public Property getProperty(String name) {
		return properties.get(name);
	}

	@Override
	public void setProperty(String name, Property value) {
		properties.put(name, value);
	}

}
