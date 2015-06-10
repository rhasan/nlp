package experiments;

import io.reader.DocumentReader;
import io.reader.LocalPlainTextReader;
import io.storage.KeyValueStorage;
import io.storage.LocalFileStorage;

public class LanguageModelExperiments {

	public static void main(String[] args) throws Exception {
		
		KeyValueStorage storage = new LocalFileStorage();
		DocumentReader reader = new LocalPlainTextReader("data/simple_wikipedia_plaintext_small.txt", storage);
		reader.computeNgrams(1);
	}
}
