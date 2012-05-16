package com.modthemod.api.property.primitive;

import com.modthemod.api.util.FunctionExecutor;

/**
 * Represents a callable function.
 */
public class Function extends Primitive<FunctionExecutor> {

	public Function(FunctionExecutor value) {
		super(value);
	}

}
