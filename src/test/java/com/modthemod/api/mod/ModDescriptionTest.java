package com.modthemod.api.mod;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModDescriptionTest {
	@Test
	public void testLoad_String() {
		// TODO more tests
		ModDescription desc = ModDescription.load("{"
				+ "         \"author\": \"Bob\"     " + "}");

		String expected = "Bob";
		String result = desc.getAuthor();
		assertEquals(expected, result);
	}
}
