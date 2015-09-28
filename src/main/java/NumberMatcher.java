
public class NumberMatcher {
	
	private String inputValue; 
	
	public NumberMatcher(String input) {
		this.setInputValue(input);
	}

	public String matchedValue() {
		return OCRDictionary.mappings.containsKey(getInputValue()) ? OCRDictionary.mappings.get(getInputValue()).toString() : "?";
				
	}

	public String getInputValue() {
		return inputValue;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

}
