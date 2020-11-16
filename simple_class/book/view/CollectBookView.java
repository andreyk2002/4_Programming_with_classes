package by.epam_tc.class_programming.simple_class.book.view;

import by.epam_tc.class_programming.simple_class.book.entity.*;
import by.epam_tc.class_programming.simple_class.book.*;

public class CollectBookView {

	private CollectBookLogic logic = new CollectBookLogic();
	private BookView view = new BookView();

	public void showByAuthor(CollectBook books, String author) {
		for (var book : books.getBooks()) {
			if (logic.findAuthor(book, author)) {
				view.showInfo(book);
			}
		}
	}

	public void showByPublisher(CollectBook books, String publisher) {
		for (var book : books.getBooks()) {
			if (book.getPublisher().equals(publisher)) {
				view.showInfo(book);
			}
		}
	}

	public void showByMinYear(CollectBook books, int minYear) {
		for (var book : books.getBooks()) {
			if (book.getYear() >= minYear) {
				view.showInfo(book);
			}
		}
	}
}
