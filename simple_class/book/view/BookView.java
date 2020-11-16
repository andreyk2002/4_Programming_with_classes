package by.epam_tc.class_programming.simple_class.book.view;

import by.epam_tc.class_programming.simple_class.book.entity.*;

import java.util.*;

public class BookView {

	public String getAuthorsNames(List<String> authors) {
		StringBuilder authorsList = new StringBuilder();
		for (int i = 0; i < authors.size(); i++) {
			authorsList.append(authors.get(i));
			if (i != authors.size() - 1) {
				authorsList.append(", ");
			}
		}
		return authorsList.toString();
	}

	public void showInfo(Book b) {

		System.out.print("Book:" + b.getName() + "(ID = " + b.getID() + "). Authors:");
		System.out.print(this.getAuthorsNames(b.getAuthors()) + ";\npublisher - " + b.getPublisher());
		System.out.print("; year - " + b.getYear());
		System.out.print("; numbOfPages - " + b.getNumbOfPages() + ", price - " + b.getPrice() + "p.; ");
		if (b.isInHardCover()) {
			System.out.println("in hard cover.");
		} else {
			System.out.println("in soft cover.");
		}

	}
}
