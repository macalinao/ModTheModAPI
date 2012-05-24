package com.modthemod.api.base;

import java.util.List;
import java.util.Map;

import com.modthemod.api.entity.Entity;
import com.modthemod.api.property.Property;

public interface EntityFinder {
	/**
	 * Finds entities that match the given properties.
	 * 
	 * @param properties
	 *            The properties to match for.
	 * @return The entities that match the given properties.
	 */
	public List<Entity> find(Map<String, Property<?>> properties);
}
