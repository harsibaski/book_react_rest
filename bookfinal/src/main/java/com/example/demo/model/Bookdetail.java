package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookdetail")
public class Bookdetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String bookName;
    private int price;
    private int year;
    private String author;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return author;
	}
	public void setColor(String color) {
		this.author = color;
	}
	public Bookdetail(Long id, String bookName, int price, int year, String color) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.year = year;
		this.author = color;
	}
	@Override
	public String toString() {
		return "Bookdetail [id=" + id + ", bookName=" + bookName + ", price=" + price + ", year=" + year + ", color="
				+ author + "]";
	}
	public Bookdetail() {
		super();
	}
	
    
    
}
