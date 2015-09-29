import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;


public class AccountNumber {
	private static final int DIGIT_WIDTH = 3;
	private List<String> entry = new ArrayList<String>();
	private String accountString;
	
	public AccountNumber(ArrayList<String> ocrLines) {
		this.getEntry().addAll(ocrLines);
		this.setAccountString(computeAccount());
	}
	
	public String toString() {
		return this.getAccountString() + " " + this.getAccountStatus();
	}

	private String getAccountStatus() {
		if (this.getAccountString().contains("?")) {
			return "ILL";
		}
		if(!AccountNumberChecker.isValidChecksum(this.getAccountString())) {
			return "ERR";
		}
		return "";
	}

	private String computeAccount() {
		String accountNumber = "";
		for(int i = 0; i <= 24; i++) {
			if( i % DIGIT_WIDTH  == 0) {
				int endIndex = i + DIGIT_WIDTH;
				String digit = StringUtils.substring(getEntry().get(0), i, endIndex) + 
						       StringUtils.substring(getEntry().get(1), i, endIndex) + 
						       StringUtils.substring(getEntry().get(2), i, endIndex);
				NumberMatcher matcher = new NumberMatcher(digit);
				accountNumber += matcher.matchedValue();
			}
		}
		return accountNumber; 
	}

	public List<String> getEntry() {
		return entry;
	}

	public void setEntry(List<String> entry) {
		this.entry = entry;
	}

	public String getAccountString() {
		return accountString;
	}

	public void setAccountString(String accountString) {
		this.accountString = accountString;
	}
	
}
