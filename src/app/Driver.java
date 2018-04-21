package app;

import lab05.Biography;
import lab05.Book;
import lab05.BookStore;
import lab05.Name;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookStore store = new BookStore();
		
		System.out.println("Creating a book (success)");
		try {
			store.addBook(new Name("J.R.R."), new Name("Tolkien"), "The Lord of the Rings", 1968 );
			store.addBook(new Name("Miguel de"), new Name("Cervantes"), "Don Quixote", 1605 );
			store.addBook(new Name("Hernan"), new Name("Melville"), "Moby Dick", 1851 );
			store.addBook(new Name("William"), new Name("Shakespeare"), "Hamlet", 1601 );
			store.addBook(new Name("Fredrik"), new Name("Backman"), "Beartown: A Novel", 2017 );
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
		System.out.println("Creating a book (failure by date)");
		try {
			store.addBook(new Name("John"), new Name("Johnson"), "A tale from the future", 2019 );
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
		System.out.println("Creating a book (failure by empty name)");
		try {
			store.addBook(new Name(""), new Name(""), "Anonymous Book", 2019 );
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}

		System.out.println("Creating a book (failure by empty title)");
		try {
			store.addBook(new Name("Unknown"), new Name("Author"), "", 2019 );
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}

		System.out.println("Creating a book (failure by null title)");
		try {
			store.addBook(new Name("Unknown"), new Name("Author"), null, 2019 );
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
		System.out.println("Creating a biography (success)");
		try {
			Book book0=new Biography(new Name("Karen"), new Name("Blumenthal"), "Steve Jobs: The Man Who Tought Different", 2012, "Steve Jobs");
			store.addBook(book0);
			Book book1=new Biography(new Name("Walter"), new Name("Isaacson"), "The genious biographies: Steve Jobs", 2011, "Steve Jobs");
			store.addBook(book1);
			
			System.out.println("Comparing biographies");
			System.out.println(book0);
			System.out.println(book1);
			System.out.println("Result: "+book0.equals(book1));
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		

		store.displayBooks();

	}

}
