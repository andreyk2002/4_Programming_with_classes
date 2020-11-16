package by.epam_tc.class_programming.simple_class.book.entity;

import java.io.Serializable;
import java.util.List;

public class CollectBook implements Serializable{

	private static final long serialVersionUID = 7534965058001240840L;
	private List<Book> books;

	public CollectBook(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	@Override
	public String toString() {
		return "CollectBook [books=" + books + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectBook other = (CollectBook) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

}
