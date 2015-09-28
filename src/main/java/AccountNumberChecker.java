import org.apache.commons.lang.StringUtils;


public class AccountNumberChecker {

	public static boolean isValidChecksum(String accountNumber) {
		String reverse = StringUtils.reverse(accountNumber);
		int total  = 0;
		for(int i = 0; i < reverse.length(); i++ ) {
			int multiplier = i + 1;
			int digit = Integer.parseInt(reverse.charAt(i) + "");
			total += multiplier * digit;
		}
		if( (total % 11) == 0) {
			return true;
		}
		return false;
	}

}
