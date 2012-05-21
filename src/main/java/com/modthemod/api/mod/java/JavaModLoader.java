package com.modthemod.api.mod.java;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLoader;

public class JavaModLoader implements ModLoader<JavaMod> {
	public static final List<Pattern> FILTERS = Arrays.asList(Pattern
			.compile("\\.jar$"));

	@Override
	public String getLanguage() {
		return "Java";
	}

	@Override
	public JavaMod loadMod(File file) {
		return new JavaMod(); // TODO
	}

	@Override
	public ModDescription loadDescription(File file) {
		return new ModDescription(); // TODO
	}

	@Override
	public List<Pattern> getFileFilters() {
		return FILTERS;
	}

	@Override
	public void enableMod(JavaMod mod) {
		mod.onEnable();
	}

	@Override
	public void disableMod(JavaMod mod) {
		mod.onDisable();
	}

}
