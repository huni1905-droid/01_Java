package edu.kh.poly.ex1.medel.dto;

public class Car /* extends Object(다른 상속이 없는 경우만 Object를 상속한다)*/{
	// 속성
	private String engine; 	// 엔진
	private String fuel;	// 연료
	private int wheel; 		// 비퀴갯수
	
	
	// 기능(생성자 + 메서드)
	public Car() {} //기본 생성자

	public Car(String engine, String fuel, int wheel) { // 매개변수 생성자
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	
	
	

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	
	
	// Object.toString() 오버라이딩
	// 오버라이딩?
	// -> 부모클래스에서 정의된 메서드를 자식클래스가 재정의하는 것.
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
	
	
	
	
}
