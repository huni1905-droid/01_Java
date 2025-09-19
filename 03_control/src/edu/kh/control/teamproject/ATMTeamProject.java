package edu.kh.control.teamproject;

import java.util.Scanner;

public class ATMTeamProject {

	Scanner sc = new Scanner(System.in);
	
	public void ex() {
		System.out.println("=== ATM프로그램 시작 ===");
		System.out.println("현재 잔액 : 10000원");

		int total = 10000;
		int input = 0;


		
		while(input != 4) {
			System.out.println();
			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			input = sc.nextInt();
			System.out.println();
			
			switch(input) {
			
			case 1 : System.out.print("입금할 금액을 입력하세요: ");
					int deposit = sc.nextInt();
					total = total + deposit;
					 System.out.printf("입금 완료! 현재 잔액: %d원\n", total);
					 break;
					 
			case 2 : System.out.print("출금할 금액을 입력하세요: ");
					int withdraw = sc.nextInt();
					if(withdraw >= total) {
						System.out.printf("잔액 부족! 현재 잔액은 %d원 입니다.\n", total);
						
					} else { 
						total = total - withdraw;
						System.out.printf("출금 완료! 현재 잔액: %d원\n", total);
					}
					break;
					
			case 3 : System.out.printf("현재 잔액은 %d원 입니다\n", total);	
					break;
					
			case 4 : System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!\n");
					break;
			
			default :System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.\n");	
					 
					 
			}
			
			
		}
		
		
	}
	

}
	
	

