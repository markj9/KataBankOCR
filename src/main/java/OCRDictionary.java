import java.util.HashMap;
import java.util.Map;


public class OCRDictionary {
	public static final Map<String, Integer> mappings;
	
	public static final String ZERO   = " _ " +
				    				    "| |" +
				    				    "|_|";
	
	public static final String ONE    = "   " +
				    				    "  |" +
				    				    "  |";
	
	public static final String TWO    = " _ " +
			  						    " _|" +
			                            "|_ ";	
	
	public static final String THREE  = " _ " +
			  							" _|" +
			  							" _|";
	
	public static final String FOUR   = "   " +
		   						        "|_|" +
		   						        "  |";
	
	public static final String FIVE   = " _ " +
			  							"|_ " +
			  							" _|";
	
	public static final String SIX    = " _ " +
			  							"|_ " +
			  							"|_|";
	
	public static final String SEVEN  = " _ " +
			  							"  |" +
			  							"  |";
	
	public static final String EIGHT  = " _ " +
			  							"|_|" +
			  							"|_|";
	
	public static final String NINE   = " _ " +
			  							"|_|" +
			  							" _|";
	
	static {
		mappings = new HashMap<String, Integer>();
		mappings.put(ZERO, 0);
		mappings.put(ONE, 1);
		mappings.put(TWO, 2);
		mappings.put(THREE, 3);
		mappings.put(FOUR, 4);
		mappings.put(FIVE, 5);
		mappings.put(SIX, 6);
		mappings.put(SEVEN, 7);
		mappings.put(EIGHT, 8);
		mappings.put(NINE, 9);
	}	
}
