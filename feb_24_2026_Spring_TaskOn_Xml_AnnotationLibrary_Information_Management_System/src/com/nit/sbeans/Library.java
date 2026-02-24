package com.nit.sbeans;

import java.util.List;

public class Library {
	String libraryName;
	List<Book> book;

	public Library(String libraryName, List<Book> book) {
		this.libraryName = libraryName;
		this.book = book;
	}

	public String showLibraryData() {
		return "Library [libraryName=" + libraryName + ", book=" + book + "]";
	}
	
	

}
