package lab05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Bookstore Class
 * @author francisco
 *
 */
public class BookStore {
	
	/**
	 * List of books in the store
	 */
	ArrayList<Book> books;
	
	/**
	 * Basic constructor
	 */
	public BookStore() {
		books = new ArrayList<Book>();
	}

	/**
	 * Adds a Book to the list
	 * @param book New book to add
	 */
	public void addBook(Book book){
		books.add(book);
	}
	
	/**
	 * Adds a book using all parameters of Book
	 * @param firstName First name of the book's author
	 * @param lastName Last name of the book's author
	 * @param title Title of the book
	 * @param yearPublished Year published
	 */
	public void addBook(Name firstName, Name lastName, String title, int yearPublished){
		Book newBook;
		try {
			newBook = new Book(firstName, lastName, title, yearPublished);	
			addBook(newBook);
		} catch (InvalidArgumentException e1) {
			System.out.println("Error in argument: "+e1.getMessage());
		} catch (InvalidBookDateException e2) {
			System.out.println("Error in date: "+e2.getMessage());
		} catch (Exception e3) {
			System.out.println("Unexpected error: "+ e3.getMessage());
		}
		
	}

	/**
	 * Lists all books in the bookstore
	 */
	public void listBooks(){
		System.out.println("=========================");
		for (int i = 0; i < books.size(); i++) {
			System.out.print(String.format("%03d: ", i+1));
			System.out.println(books.get(i).toString());
		}
		System.out.println("=========================");
	}
	
	/**
	 * Sorts all books in the bookstore
	 */
	public void sortBooks(){
		Collections.sort(books);
	}
	
	/**
	 * Display, sort and display again all books
	 */
	public void displayBooks(){
		System.out.println("List of books (unordered)");
		listBooks();
		System.out.println("Sorting books...");
		sortBooks();
		System.out.println("List of books (ordered)");
		listBooks();
	}

}
