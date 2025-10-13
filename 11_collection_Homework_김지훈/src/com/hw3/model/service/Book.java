package com.hw3.model.service;

public class Book {

	public int bookNum;
	public String title;
	public String author;
	public int price;
	public String publisher;
	
	public Book() {}

	public Book(int bookNum, String title, String author, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}
