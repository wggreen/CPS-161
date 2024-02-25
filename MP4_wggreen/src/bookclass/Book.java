package bookclass;

import java.time.LocalDate;

public class Book {
	private String name;
	private Author author;
	private String ISBN;

	public Book(String name, String authorFirstName, String authorLastName, String birthday, String ISBN, double price) {
		super();
		this.name = name;
		this.author = new Author(authorFirstName, authorLastName, LocalDate.parse(birthday));
		this.ISBN = ISBN;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [" + name + " by "  + author.getFirstName() + " " + author.getLastName() + "(birthday: " + author.getBirthday() + ") " + "isbn=" + ISBN + ",\nprice=" + price;
	}

	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
