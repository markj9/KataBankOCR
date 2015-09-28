import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;


public class KataBankOCR {
	private String inputFileLocation;
	private String outputFileLocation;
	
	public KataBankOCR(String inputFileLocation, String outputFileLocation) {
		this.setInputFileLocation(inputFileLocation);
		this.setOutputFileLocation(outputFileLocation);
	}


	public void execute() throws IOException {
		List<String> inputLines = FileUtils.readLines(new File(inputFileLocation));
		ArrayList<AccountNumber> accountNumbers = new BankFileProcessor(inputLines).detectAccountNumbers();
		FileUtils.writeLines(new File(outputFileLocation), accountNumbers);
	}

	public String getInputFileLocation() {
		return inputFileLocation;
	}

	public void setInputFileLocation(String inputFileLocation) {
		this.inputFileLocation = inputFileLocation;
	}

	public String getOutputFileLocation() {
		return outputFileLocation;
	}

	public void setOutputFileLocation(String outputFileLocation) {
		this.outputFileLocation = outputFileLocation;
	}

}
