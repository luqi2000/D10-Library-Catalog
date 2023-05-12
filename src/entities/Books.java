package entities;

public class Books extends LibraryCatalog{
	//attribute
	 String author;
	 String genre;
	 
	 //costructor
	public Books(String isbn, String title, int yearPublication, int pageNumber, String author, String genre) {
		super(isbn, title, yearPublication, pageNumber);
		this.author = author;
		this.genre = genre;
	}
	
	//getters & setters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book {isbn: " + isbn + " title: "+ title + " author: " + author + " yearPublication: "+ yearPublication +  " genre: " + genre + "}"+ System.lineSeparator();
	}
}
