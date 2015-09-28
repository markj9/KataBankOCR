import static org.junit.Assert.*;

import org.junit.Test;


public class AccountNumberCheckerTest {

	@Test
	public void testValid() {
		String accountNumber = "345882865";
		assertTrue(AccountNumberChecker.isValidChecksum(accountNumber));
	}
	
	@Test
	public void testInvalid() {
		assertFalse(AccountNumberChecker.isValidChecksum("664371495"));
	}

}
