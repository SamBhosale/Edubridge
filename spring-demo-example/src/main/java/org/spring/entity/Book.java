package org.spring.entity;

public class Book {
	
	private int booId;
	private String bookName;
	private String auther;
	public Book(int booId, String bookName, String auther) {
		super();
		this.booId = booId;
		this.bookName = bookName;
		this.auther = auther;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBooId() {
		return booId;
	}
	public void setBooId(int booId) {
		this.booId = booId;
	}
	@Override
	public String toString() {
		return "Book [booId=" + booId + ", bookName=" + bookName + ", auther=" + auther + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}

}
