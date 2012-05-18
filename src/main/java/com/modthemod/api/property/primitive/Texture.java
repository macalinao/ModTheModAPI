package com.modthemod.api.property.primitive;

/**
 * Represents a reference to a texture.
 */
public class Texture extends Primitive<String> {

	/**
	 * Texture constructor.
	 * 
	 * @param value
	 *            The path to where the texture is located relative to the mod.
	 */
	public Texture(String value) {
		super(value);
	}

}
