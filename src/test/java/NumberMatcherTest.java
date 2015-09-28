import static org.junit.Assert.*;

import org.junit.Test;


public class NumberMatcherTest {

	@Test
	public void validDictionaryTest() {
		NumberMatcher subject = new NumberMatcher(OCRDictionary.ZERO);
		assertEquals("0", subject.matchedValue());
	}
	
	@Test
	public void invalidDictionaryTest() {
		NumberMatcher subject = new NumberMatcher(" ");
		assertEquals("?", subject.matchedValue());
	}
	
}
