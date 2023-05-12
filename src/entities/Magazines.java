package entities;

public class Magazines extends LibraryCatalog{

	//attribute
	private Periods period;
	
	//costructor
	public Magazines(String isbn, String title, int yearPublication, int pageNumber, Periods period) {
		super(isbn, title, yearPublication, pageNumber);
		this.period = period;
	}	
	
	public Periods getPeriod() {
		return period;
	}

	public void setPeriod(Periods period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return "Magazine {isbn: " + isbn + " title: " + title + " period: " + period
				+ " publicationYear: " + yearPublication + " numPages: " + pageNumber + "}" + System.lineSeparator();
	}
}
