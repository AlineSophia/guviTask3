package com.guvi.task3;

import java.util.Scanner;

public class BookManagementSysitem {

	public static void main(String[] args) {
		Library lib = new Library();
		int flag = 1;
		lib.addBook(101, "Jungle", "Max", true);
		lib.addBook(102, "City", "Brain", true);
		lib.addBook(103, "Beauty", "Selena", true);
		lib.addBook(104, "Sleep", "Rich", false);
		lib.addBook(105, "Success", "David", true);
		System.out.println("List of books available");
		
		while (flag == 1) {
			//To get the input operation from user
			Scanner scanner = new Scanner(System.in);
			System.out.println("Available options are");
			System.out.println("1. Add a Book");
			System.out.println("2. Search a Book");
			System.out.println("3. Remove a Book");
			System.out.println("4. Display the Books");
			switch (scanner.nextInt()) {
			case 1:
				//To add the book to the library. getting the book details from the user
				System.out.println("To add a book, give the below details");
				System.out.println("BookId");
				int bookId = scanner.nextInt();
				System.out.println("Book Title");
				String title = scanner.next();
				System.out.println("Book Author");
				String author = scanner.next();
				lib.addBook(bookId, title, author, true);
				System.out.println("The book is added successfully");
				System.out.println("Do you want to continue Y/N");
				if (scanner.next().equalsIgnoreCase("n")) {
					flag = 0;
				}
				break;
			case 2:
				//To search the book
				System.out.println("Enter the name of the book to search");
				lib.searchBookByName(scanner.next());
				System.out.println("Do you want to continue Y/N");
				if (scanner.next().equalsIgnoreCase("n")) {
					flag = 0;
				}
				break;
			case 3:
				//To remove the book
				System.out.println("Enter the name of the book to remove");
				lib.removeBook(scanner.next());
				System.out.println("Do you want to continue Y/N");
				if (scanner.next().equalsIgnoreCase("n")) {
					flag = 0;
				}
			case 4:
				// To display the list of book
				lib.displayBook();
				System.out.println("Do you want to continue Y/N");
				if (scanner.next().equalsIgnoreCase("n")) {
					flag = 0;
				}

			}
		}

	}

}
