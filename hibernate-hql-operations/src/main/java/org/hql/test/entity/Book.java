package org.hql.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookinfo")
public class Book {

	@Id   //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //auto incremented field
	private int id;
	private String bookName;
	private String bookType;
	private String author;
	private double price;
	private long isbn;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String bookType, String author, double price, long isbn) {
		super();
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookType=" + bookType + ", author=" + author
				+ ", price=" + price + ", isbn=" + isbn + "]";
	}
	
	
	
}
