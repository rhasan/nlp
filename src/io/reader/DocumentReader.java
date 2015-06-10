package io.reader;


import io.storage.KeyValueStorage;

public interface DocumentReader {
	
	
	public void computeNgrams(int pN) throws Exception;
	
	public KeyValueStorage getStorage();
	public void setStorage(KeyValueStorage pStorage);
	
}
