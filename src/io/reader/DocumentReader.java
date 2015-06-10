package io.reader;

import io.storage.KeyValueStorage;

public interface DocumentReader {
	
	public KeyValueStorage getStorage();
	public void setStorage(KeyValueStorage pStorage);
	
}
