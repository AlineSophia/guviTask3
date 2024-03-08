package com.guvi.task3;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private Book[] books = new Book[500];
	// Initializing a list to add the book object
	private List<Book> listBook = new ArrayList<Book>();

	public Library() {

	}

	public Library(Book[] books) {
		this.books = books;
	}

	// Method to add a book to the library
	void addBook(int bookId, String title, String author, Boolean isAvailable) {
		listBook.add(new Book(bookId, title, author, isAvailable));
	}

	// Method to remove a book to the library
	void removeBook(String bookName) {
		for (int i = 0; i <= listBook.size() - 1; i++) {
			if (listBook.get(i).title.equalsIgnoreCase(bookName)) {
				listBook.remove(i);
			}
		}
		System.out.println("The book has been removed successfully");
	}

	// Method to search a book to the library
	void searchBookByName(String bookName) {
		for (int i = 0; i <= listBook.size() - 1; i++) {
			if (listBook.get(i).title.equalsIgnoreCase(bookName)) {
				System.out.println("The details of the book you searched are given below");
				System.out.println("Book Id = " + listBook.get(i).getBookId());
				System.out.println("Book Title = " + listBook.get(i).getTitle());
				System.out.println("Book Author = " + listBook.get(i).author);
			}
		}

	}

	// Method to display a book to the library
	void displayBook() {
		System.out.println("The total number of book in the library are listed below");
		for (int i = 0; i <= listBook.size() - 1; i++) {
			System.out.println("Book Id: " + listBook.get(i).bookId + ", Book Title: " + listBook.get(i).title
					+ ", Book Author : " + listBook.get(i).author);
		}
	}

}
