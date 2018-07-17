package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET

	private boolean doBracketsMatch(String b) {
		Stack<Character> bracket = new Stack<Character>();
		b = "{}{}{}{}";

		for (int i = 0; i < b.length(); i++) {

			char c = b.charAt(i);

			if (c == '}') {
				if (bracket.empty()) {
					return false;
				} else {
					bracket.pop();
				}
			}

			if (c == '{') {
				bracket.push('{');
				if (bracket.empty()) {
					return true;
				}
			}

		}

		return false;
	}

}