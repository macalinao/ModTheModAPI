package com.modthemod.api.event;

public interface EventListener {
	/**
	 * Executes the action of the {@link EventListener}.
	 * 
	 * @param event The {@link Event} to execute based on.
	 */
	public void execute(Event event);
}
