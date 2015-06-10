package nlp.utils;

public class TextProcessingUtils {
	
	public static boolean isEmptyLine(String pLine) {
		return pLine.trim().isEmpty();
	}

	public static boolean isInsignificant(String pLine) {
		//Average word length in English is 5.1 characters
		return isEmptyLine(pLine) || pLine.length() < 5;
	}
}
