package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();

		System.out.print("멤버십 있으세요? ");
		boolean isMember = sc.nextBoolean();
		//"true" / "false"
		
		double discount = isMember? price*0.1 : price*0.05;
		double totalPrice = price - discount;

		System.out.println("할인가격 : " + discount);
		System.out.println("할인을 포함한 최종금액 : " + totalPrice + "원");
		//자바에서는 문자열끼리 비교 == 사용x
		//->equals()사용
		
	}
	
	public void practice2() {
		
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000; //5만원짜리 지폐 개수
		
		amount %= 50000; //복합대입연산자
		// amount = amount % 50000; 
		// 5만원짜리 지폐를 거르고 난 뒤 나머지 금액
		// 나머지 값을 amount 변수에 재대입해야 
		// 아래 다음 지폐에서 재사용 할 수 있음
		
		int tenTh = amount / 10000; //1만원짜리 지폐 개수
		amount %= 10000;
		
		
		int fiveTh = amount / 5000; //5천원짜리 지폐 개수
		amount %= 5000;
		
		int oneTh = amount / 1000; // 1천원짜리 지폐 개수
		
		System.out.println("50000원 : " + fiftyTh);
		System.out.println("10000원 : " + tenTh);
		System.out.println("5000원 : " + fiveTh);
		System.out.println("1000원 : " + oneTh);
		
		
		
	}
	
	public void practice3() {
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		//첫번째 수가 두번째 수의 배수인지
		//==첫번째 수가 두번째 수로 나누어 떨어진다
		//==첫번째를 두번째로 나누었을때 나머지가 0이다.
		
		String res = num1 % num2 ==0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(res);
		
		
		
		
		
	}
}
