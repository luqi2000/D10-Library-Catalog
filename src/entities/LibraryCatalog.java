package entities;


public abstract class LibraryCatalog {
	
	//Attribute
	protected String isbn;
	protected String title;
	protected int yearPublication;
	protected int pageNumber;
	
	//costructor
	public LibraryCatalog(String isbn, String title, int yearPublication, int pageNumber) {
		this.isbn = isbn;
		this.title = title;
		this.yearPublication = yearPublication;
		this.pageNumber = pageNumber;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	@Override
	public abstract String toString();

}
