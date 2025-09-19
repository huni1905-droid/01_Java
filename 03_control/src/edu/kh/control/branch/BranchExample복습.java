package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample복습 {
	
	public void RSPGame2() {
		
		// 가위바위보게임
		// 몇 판할지 입력 받음
		// 입력받은 판 수 만큼 반복
		//
		// 컴퓨터 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		// 1 ~ 3 사이 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보 지정
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다ㅠㅠ / 비겼습니다
		// 매판마다 - 현재 기록 : 2승 1무 0패 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 판? ");
		int round = sc.nextInt();
		
		for(int i=1; i<=round; i++) {
			
			System.out.println("\n" + round + "번째 게임");
			System.out.println("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1 );
			
			String com = null;
			
			switch(random) {
			case 1 : com = "가위"; break; 
			case 2 : com = "바위"; break; 
			case 3 : com = "보"; break; 
			
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
		
			
			
		}
			
		
	}

	
}
