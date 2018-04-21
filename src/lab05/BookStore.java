package lab05;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {
	
	ArrayList<Book> books;
	
	public BookStore() {
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	
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
	
	public void listBooks(){
		System.out.println("=========================");
		for (int i = 0; i < books.size(); i++) {
			System.out.print(String.format("%03d: ", i+1));
			System.out.println(books.get(i).toString());
		}
		System.out.println("=========================");
	}
	
	public void sortBooks(){
		Collections.sort(books);
	}
	
	public void displayBooks(){
		System.out.println("List of books (unordered)");
		listBooks();
		System.out.println("Sorting books...");
		sortBooks();
		System.out.println("List of books (ordered)");
		listBooks();
	}

}
