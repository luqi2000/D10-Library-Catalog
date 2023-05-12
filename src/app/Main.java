package app;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import entities.Books;
import entities.Magazines;
import entities.LibraryCatalog;
import entities.Periods;

public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	private static File file = new File("Archive.txt");
	
	public static void main(String[] args) {
	logger.info("Welcome");
	
		try {
			saveOnDisk();
			logger.info(readFileFromDisk());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//All characteristic from LibraryCatalog plus overriding and overload from Books 
		LibraryCatalog book1 = new Books("100000b", "The fifth science", 2019, 320, "Exurb", "science");
		LibraryCatalog book2 = new Books("110000b", "Verity", 2022, 336, "Hoover Collen", "crime");
		LibraryCatalog book3 = new Books("120000b", "The Village", 2019, 480, "Rachael Mclean", "Horror");
		LibraryCatalog magazine1 = new Magazines("100000r", "ToyCollectr", 2023, 57, Periods.monthly);
		LibraryCatalog magazine2 = new Magazines("110000r", "Britannica magazine", 2010, 25, Periods.halfYearly);
		LibraryCatalog magazine3 = new Magazines("120000r", "Noir magazine", 2020, 46, Periods.weekly);
		
		List<LibraryCatalog> catalog = new ArrayList<>();
		
		//Esercize 1: adding elements
		
		catalog.add(book1);
		catalog.add(book2);
		catalog.add(book3);
		catalog.add(magazine1);
		catalog.add(magazine2);
		catalog.add(magazine3);
		logger.info("Starting");
		logger.info(catalog.toString());
		
		
		//Esercize 2: removing elements with isbn 
		
		List<LibraryCatalog> removingSomething = catalog.stream().filter(n -> !String.valueOf(n.getIsbn()).equals("100000b")).toList();
		logger.info("Succesfull deleted");
		logger.info(removingSomething.toString());
		
		//Esercize 3: Search from isbn
		
		List<LibraryCatalog> searchIsbn = catalog.stream().filter(z -> z.getIsbn().equals("100000r")).toList();
		logger.info("Here your searched catalog");
		logger.info(searchIsbn.toString());
		
		//Esercize 4: Search by yearOfPublication
		
		List<LibraryCatalog> searchByYear = catalog.stream().filter(year -> year.getYearPublication() == 2020).toList();
		logger.info("Here your catalog searched by Year");
		logger.info(searchByYear.toString());
		
		//Esercize 5: Search by author
//		List<LibraryCatalog> searchByAuthor = catalog.stream().filter(authorr -> ((Books) authorr).getAuthor().equals("")).toList();
//		logger.info("Here your searched catalog");
//		logger.info(searchByAuthor.toString());
	}
	
	//method static for Read from Disk
	public static String readFileFromDisk() throws IOException{
		if(file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;
		} else {
			System.out.println("File not found");
			return "";
		}
	}
	//method static for Save in file 
	public static void saveOnDisk() throws IOException{
		FileUtils.writeStringToFile(file, "I'm still learning how to add" + System.lineSeparator(),"UTF-8", true);
	}
	
}
