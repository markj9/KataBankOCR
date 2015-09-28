import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;


public class KataBankOCRTest {

	@Test
	public void smokeTestAccountNumbers() throws IOException {
		String inputFileLocation = "/usr/local/src/katas/KataBankOCR/src/test/java/smokeTestFixture.txt";
		String outputFileLocation = "/usr/local/src/katas/KataBankOCR/src/test/java/output/smokeTestOutput.txt";
		String expectedOutput = "123456789 \n" +
								"123456789 \n" +
								"000000000 \n";
		KataBankOCR subject = new KataBankOCR(inputFileLocation, outputFileLocation);
		subject.execute();
		assertEquals(expectedOutput, FileUtils.readFileToString(new File(outputFileLocation)));
	}
	
	@Test
	public void smokeTestUseCase3() throws IOException {
		String inputFileLocation = "/usr/local/src/katas/KataBankOCR/src/test/java/useCase3Fixture.txt";
		String outputFileLocation = "/usr/local/src/katas/KataBankOCR/src/test/java/output/useCase3Output.txt";
		String expectedOutput = "000000051 \n" +
								"49006771? ILL\n";
		KataBankOCR subject = new KataBankOCR(inputFileLocation, outputFileLocation);
		subject.execute();
		assertEquals(expectedOutput, FileUtils.readFileToString(new File(outputFileLocation)));
	}

}


