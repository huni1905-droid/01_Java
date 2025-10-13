package edu.kh.poly.ex2.model.service;
											
public class KJHCalculator implements Calculator/*, TestInterface 형태로 
													다른 인터페이스명(인터페이스는 다중 상속 받을수 있다.)*/{
	// extends : 확장하다
	// implements : 구현하다
	// 사용 구분
	// (부모)클래스 - (자식)클래스 : extends
	// (부모)인터페이스 - (자식)인터페이스 : extends
	// (부모)인터페이스 - (자식)클래스 : implements
	// (부모)클래스 - (자식)인터페이스 : 상속 불가
	
	
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}




	
	

	

	
	
}
