package edu.kh.variable;

//class:코드를 작성하는 곳->클래스 {}안에 작성해야한다.
public class VariableExample1 {

	public static void main(String[] args) {

		//변수 미사용
		System.out.println(2*3.141592653589793*5); //원의 둘레
		System.out.println(3.141592653589793*5*5); //원의 넓이
		System.out.println(3.141592653589793*5*5*20); //원기둥의 부피
		System.out.println(4*3.141592653589793*5*5); //구의 겉넓이
		
		//변수 사용
		double pi = 3.141592653589793; //원주율
		int r = 5; //반지름(radius)
		int h =20; //높이(hight)
		
		System.out.println(2*pi*r);//원의 둘레
		System.out.println(pi*r*r);//원의 넓이
		System.out.println(pi*r*r*h);//원긴둥의 부피
		System.out.println(4*pi*r*r);//구의 겉넓이
		
				
		
	}

}
