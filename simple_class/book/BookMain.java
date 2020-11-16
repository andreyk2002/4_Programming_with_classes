package by.epam_tc.class_programming.simple_class.book;

import by.epam_tc.class_programming.simple_class.book.view.CollectBookView;
import java.util.ArrayList;
import by.epam_tc.class_programming.simple_class.book.entity.*;;

public class BookMain {
	public static void main(String[] argc) {

		CollectBook books = new CollectBook(new ArrayList<Book>());
		

		CollectBookView booksView = new CollectBookView();

		books.getBooks().add(new Book("Конец вечности", "Isaak Asimov", "Асвета", 2007, 501, 22.6f, true));
		books.getBooks().add(new Book("451 грудус по фаренгейту", "Ray Bradburry", "Дом печати", 2015, 340, 19.4f, true));
		books.getBooks().add(new Book("Затерянный мир", "Arthur Conan - Doyle", "Дом печати", 2018, 611, 32.4f, true));
		books.getBooks().add(new Book("The dark tower(pt. 1,2,3)", "Stephen King", "New York press ", 2005, 1002, 37.4f, true));

		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Arkady Strugatsky");
		authors.add("Boris Stugatsky");
		books.getBooks().add(new Book("Жук в муравейнике", authors, "Асвета", 2017, 322, 13.2f, false));
		books.getBooks().add(new Book("Волны гасят ветер", authors, "Дом печати", 2017, 302, 13.0f, false));

		books.getBooks().add(new Book("Отверженные", "Victor Gugo", "Классика", 2018, 1542, 51.0f, true));
		books.getBooks().add(new Book("Пятнадцатилетний капитан", "Juli Vern", "Асвета", 2002, 416, 15.4f, true));
		books.getBooks().add(new Book("Город", "Clifford Saimak", "Дом печати", 2016, 297, 14.2f, false));
		books.getBooks().add(new Book("Дюна", "Frank Herbert", "Дом печати", 2018, 534, 22.9f, true));
		books.getBooks().add(new Book("Азазель", "Boris Akynin", "Асвета", 2009, 294, 19.5f, true));

		System.out.println("books by Isaak Asimov at the store:");
		booksView.showByAuthor(books, "Isaak Asimov");

		System.out.println("\nbooks published by \"Асвета\":");
		booksView.showByPublisher(books, "Асвета");

		System.out.println("\nbooks released after 2013:");
		booksView.showByMinYear(books, 2013);
	}
}
