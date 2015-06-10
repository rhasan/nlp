package io.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
	
	@Override
	public void computeNgrams(int pN) throws Exception {

		
		FileInputStream fstream = new FileInputStream(this.mInputLocation);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String line;

		while ((line = br.readLine()) != null)   {
		  if(TextProcessingUtils.isInsignificant(line)==false) {
			  System.out.println(line);
		  }
		}

		br.close();		
	}

	//getters and setters 
	@Override
	public KeyValueStorage getStorage() {
		
		return mStorage;
	}

	@Override
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
