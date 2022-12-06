package com.java.library;

public class Book {
	int book_id;
	String book_title;
	String book_info;
	
	public void setBookId(int book_id) {
		this.book_id = book_id;
	}
	public int getBookId() {
		return book_id;
	}
	public void setBookTitle(String book_title) {
		this.book_title = book_title;
	}
	public String getBookTitle() {
		return book_title;
	}
	public void setBookInfo(String book_info) {
		this.book_info = book_info;
	}
	public String getBookInfo() {
		return book_info;
	}
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_info=" + book_info + "]";
	}
	
}
