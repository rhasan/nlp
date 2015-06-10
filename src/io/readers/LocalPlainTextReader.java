package io.readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.process.DocumentPreprocessor;

import nlp.utils.TextProcessingUtils;
import io.storage.KeyValueStorage;


public class LocalPlainTextReader implements DocumentReader {

	private KeyValueStorage mStorage = null;
	private String mInputLocation = null;
	
	
	public LocalPlainTextReader(String pInputLocation, KeyValueStorage pStorage) {
		this.mStorage = pStorage;
		this.mInputLocation = pInputLocation;
	}
	
	public void countSentenceNgrams(String pSentence, int pN) {
		
	}

	public void computeNgrams(int pN) throws Exception {

		
		FileInputStream fstream = new FileInputStream(this.mInputLocation);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String line;

		while ((line = br.readLine()) != null) {
		  if(TextProcessingUtils.isInsignificant(line)==false) {
			  System.out.println(line);
			  Reader reader = new StringReader(line);
			  DocumentPreprocessor dp = new DocumentPreprocessor(reader);
			  int i = 0;
			  for (List<HasWord> sentence : dp) {
				   //String sentenceString = Sentence.listToString(sentence);
				   //System.out.println("Sentence "+(++i)+":"+sentenceString);
				  System.out.print("Sentence "+(++i)+":");
				  for(HasWord word:sentence) {
					  System.out.print(word.toString()+"|");
				  }
				  System.out.println("");
			}
		  }
		}

		br.close();		
	}

	//getters and setters 
	public KeyValueStorage getStorage() {
		
		return mStorage;
	}


	public void setStorage(KeyValueStorage pStorage) {
		this.mStorage = pStorage;
	}

	public String getmInputLocation() {
		return mInputLocation;
	}

	public void setmInputLocation(String mInputLocation) {
		this.mInputLocation = mInputLocation;
	}

}
