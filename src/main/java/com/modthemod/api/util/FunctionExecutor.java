package com.modthemod.api.util;

/**
 * Represents the executor of a function.
 */
public interface FunctionExecutor {
	/**
	 * Executes the {@link FunctionExecutor}.
	 * 
	 * @param args
	 *            The arguments to use.
	 * @return The result of the execution.
	 */
	public Object execute(Object... args);
}
