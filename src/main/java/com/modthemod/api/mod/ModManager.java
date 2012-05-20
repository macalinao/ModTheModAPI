package com.modthemod.api.mod;

import java.util.List;

public interface ModManager {
	public Mod getMod(String name);
	public List<Mod> getMods();
}
