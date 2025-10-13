package edu.kh.poly.ex2.model.service;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점(interface)의 용도
public interface Calculator {

	// 인터페이스 : 추상클래스의 변형체(추상클래스보다 추상도 높음)
	// - 추상클래스 : 일부만 추상메서드여도 가능하다. (추상메서드 0개 이상)
	// - 인터페이스 : 모두 추상메서드 형태여야 한다.
	
	// 인터페이스의 필드는 묵시적으로 public static final -> 상수
	// 속성(필드)
	public static final double PI = 3.14;// 상수명은 모두 대문자로 쓴다.
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;// 모두 public static final 이다. 
	
	
	// 기능
	// 인터페이스의 메서드는 묵시적으로 public abstract
	public abstract int plus(int num1, int num2);
	
	int minus(int num1, int num2);
	
	public int multiple(int num1, int num2);
	
	public abstract int divide(int num1, int num2); // 전부 추상 메서드

	
	
	
	
	
	
	
	
	
	
}
