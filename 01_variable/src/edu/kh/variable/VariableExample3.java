package edu.kh.variable;

public class VariableExample3 {

	public static void main(String[] args) {
		
		// 형변환(Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외)
		/* 형변환은 왜 필요한가?
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능함
		 * 다른 자료형과 연산 시 오류 발생
		 * -->이런 상황을 해결하기 위해서 필요한 기술이 형변환
		 * 
		 * 자동 형변환 / 강제 형변환 존재
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2) );
		//13.5 (원래 에러가 발생해야 하지만 "자동형변환" 덕분에 에러 발생x)
		
		//int -> long 형변환
		int i2 = 2_100_000_000; // 21억(1000단위로 _로 구분 가능)
		long l2 = 10_000_000_000L; // 100억
		
		long result = i2 + l2;
		//        int -> long
		//long = long + long
		
		System.out.println(result);

		//char -> int 형변환
		
		char ch3 = 'V';// 한 글자인 문자를 담을 상자 char
		System.out.println(ch3);
		int i3 = ch3; // 유니코드문자로서 숫자로 인식 가능
		System.out.println(i3);
		
		// '각' 이라는 글자는 숫자 몇일까?
		char ch4 ='각'; // 각 이란 한 문자를 담을 상자 char
		int i4 = ch4;
		System.out.println(i4);
		
		

		
	}

}
