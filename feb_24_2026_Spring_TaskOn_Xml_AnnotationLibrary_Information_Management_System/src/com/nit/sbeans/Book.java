package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	int bookId;
	String bookTitle;
	Author author;

	public Book(int bookId, String bookTitle) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}

	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "Book :" + bookTitle + "| Author: " + author.authorName+"\n";
	}
	
	

}
