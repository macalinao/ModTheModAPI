package com.modthemod.api.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.modthemod.api.base.Base;

/**
 * Represents a {@link Type} corresponding with a {@link Base}.
 */
public class BaseMatcher extends Matcher {
	private List<Base> bases;

	/**
	 * Constructor for a {@link BaseMatcher}.<strong>Note: Please use
	 * {@link Type#valueOf}.</strong>
	 * 
	 * @param bases
	 *            The bases that compose this {@link BaseMatcher}.
	 */
	BaseMatcher(Base... bases) {
		this.bases = new ArrayList<Base>(Arrays.asList(bases));
	}

	@Override
	public boolean is(Type<?> other) {
		if (!(other instanceof Base)) {
			return false;
		}

		Base baseType = (Base) other;
		for (Base base : bases) {
			if (!base.is(baseType)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("(");
		boolean first = true;
		for (Base base : bases) {
			if (!first) {
				builder.append(",");
			}
			builder.append(base.getName());
		}
		builder.append(")");
		return builder.toString();
	}

}
