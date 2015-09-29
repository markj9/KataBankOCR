import java.util.ArrayList;
import java.util.List;



public class BankFileProcessor {
	private static final int LINES_PER_ENTRY = 4;
	private List<String> fileLines;
	
	public BankFileProcessor(List<String> inputLines) {
		setFileLines(inputLines);
	}
	
	public ArrayList<AccountNumber> detectAccountNumbers() {
		int lineNumber = 0;
		ArrayList<String> entryLines = new ArrayList<String>();
		ArrayList<AccountNumber> accountNumbers = new ArrayList<AccountNumber>();
		
		for(String line : getFileLines()) {
			lineNumber += 1;
			entryLines.add(line);
			if ( (lineNumber % LINES_PER_ENTRY) == 0) {
				accountNumbers.add(new AccountNumber(entryLines));
				entryLines.clear();
			}
		}
		return accountNumbers;
	}

	public List<String> getFileLines() {
		return fileLines;
	}
	
	public void setFileLines(List<String> fileLines) {
		this.fileLines = fileLines;
	}

}
