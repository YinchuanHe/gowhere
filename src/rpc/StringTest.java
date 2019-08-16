package rpc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testSubString() {
		String str = new String("This is a unit test.");
		assertEquals("unit", str.substring(10, 14));
	}

}
