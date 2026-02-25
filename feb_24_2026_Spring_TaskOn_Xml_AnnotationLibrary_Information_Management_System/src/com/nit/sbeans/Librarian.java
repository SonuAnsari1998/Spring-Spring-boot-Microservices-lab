package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Librarian {
	Library library;
	String employeeName;

	@Autowired
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String manageLibrary() {
//		return "Librarian [library=" + library.showLibraryData() + ", employeeName=" + employeeName + "]";
	return "Library: "+library.libraryName+"\nManaged By: "+employeeName+"\nBooks Available:\n"+library.showLibraryData();
	}
	
	

}
