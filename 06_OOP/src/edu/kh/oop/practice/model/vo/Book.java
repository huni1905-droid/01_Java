package edu.kh.oop.practice.model.vo;

public class Book { // book 클래스
	
	// 필드(==속성)
	private String title ;		//도서명
	private int price;			//가격
	private double discountRate;//할인율
	private String auther;		//저자명
	
	
	// 기능 (== 메서드 / 생성자)
	public Book() {}
	
	public Book(String title, int price, 
			double discountRate, String author) {
	
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.auther = auther;
	
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	
	@Override
		public String toString() {
			return title + " / " + price + " / "  
					+ discountRate + " / " + auther;
			
			
			
			
		}


	

}
