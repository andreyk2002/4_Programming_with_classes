package by.epam_tc.class_programming.simple_class.book;

import by.epam_tc.class_programming.simple_class.book.entity.Book;

public class CollectBookLogic {
		
	public boolean findAuthor(Book b, String authorName) {

		for (int i = 0; i < b.getAuthors().size(); i++) {
			String author;
			author = b.getAuthors().get(i);
			if (author == authorName) {
				return true;
			}
		}
		return false;
	}
}
