package edu.kh.poly.ex1.medel.dto;

public class Spark extends Car { // 경차를 의미하는 클래스
	
	private double discountOffer; // 할인혜택
	
	public Spark() {}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}
	
	

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
			// super. : car의 객체를 의미(return engine + " / " + fuel + " / " + wheel;)
	}

	
	
	
	
}
