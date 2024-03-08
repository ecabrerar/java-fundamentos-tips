package com.eudriscabrera.examples.java;

/**
 * 
 * @author ecabrerar
 * @since Mar 8, 2024
 */
public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String edition;
	private double price;
	private String description;
	private PriceType type;

	public Book(String isbn, String title, String author, String publisher, String edition, double price,
			String description) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.price = price;
		this.description = description;
	}

	public PriceType getType() {
		return type;
	}

	public void setType(PriceType type) {
		this.type = type;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getEdition() {
		return edition;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

}
