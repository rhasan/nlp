package io.reader;

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
	
	public void computeNgrams(int pN) {
		
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
