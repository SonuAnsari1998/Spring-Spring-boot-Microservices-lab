package com.nit.sbeans;

public class Author {
	int authorId;
	String authorName;

	public Author(int authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public String displayAuthorInfo() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

}
