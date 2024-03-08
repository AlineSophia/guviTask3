package com.guvi.task3;

public class Book {

	// Declaring variables
	int bookId;
	String title;
	String author;
	Boolean isAvailable;

	// Constructor creation
	public Book(int bookId, String title, String author, Boolean isAvailable) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	// Setters and getters for each variables
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]";
	}

}
