package by.epam_tc.class_programming.simple_class.book.entity;

import java.io.Serializable;
import java.util.*;

public class Book implements Serializable {

	private static final long serialVersionUID = -5880564903519079443L;
	private String name;
	private final int ID;
	private static int nextId = 0;
	private List<String> authors;
	private String publisher;
	private int year;
	private int numbOfPages;
	private float price;
	private boolean inHardCover;

	public void addAuthor(String authorName) {
		authors.add(authorName);
	}

	public void removeAuthor(String authorName) {
		authors.remove(authorName);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public Book() {
		this("", "", "", 0, 0, 0.0f, false);
	}

	public Book(String name, ArrayList<String> authors, String publisher, int year, int numbOfPages, float price,
			boolean inHardCover) {
		super();
		++nextId;
		ID = nextId;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.numbOfPages = numbOfPages;
		this.price = price;
		this.inHardCover = inHardCover;
	}

	public Book(String name, String author, String publisher, int year, int numbOfPages, float price,
			boolean inHardCover) {
		super();
		++nextId;
		ID = nextId;
		this.name = name;
		this.authors = new ArrayList<String>();
		this.authors.add(author);
		this.publisher = publisher;
		this.year = year;
		this.numbOfPages = numbOfPages;
		this.price = price;
		this.inHardCover = inHardCover;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumbOfPages() {
		return numbOfPages;
	}

	public void setNumbOfPages(int numbOfPages) {
		this.numbOfPages = numbOfPages;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isInHardCover() {
		return inHardCover;
	}

	public void setInHardCover(boolean inHardCover) {
		this.inHardCover = inHardCover;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", ID=" + ID + ", authors=" + authors + ", publisher=" + publisher + ", year="
				+ year + ", numbOfPages=" + numbOfPages + ", price=" + price + ", inHardCover=" + inHardCover + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + (inHardCover ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numbOfPages;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (inHardCover != other.inHardCover)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numbOfPages != other.numbOfPages)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
