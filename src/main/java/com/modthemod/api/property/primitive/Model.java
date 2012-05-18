package com.modthemod.api.property.primitive;

/**
 * Represents a reference to a 3d model.
 */
public class Model extends Primitive<String> {

	/**
	 * Model constructor.
	 * 
	 * @param value
	 *            The path to where the model is located.
	 */
	public Model(String value) {
		super(value);
	}

}
