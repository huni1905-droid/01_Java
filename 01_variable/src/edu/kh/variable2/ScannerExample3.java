package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 할줄로 출력하기
		
		// ex)
		// 입력1: 안녕?
		// 입력2: 반가워
		// 입력3: 점심뭐먹지?
		// 안녕? 반가워 점심뭐먹지?

		Scanner sc = new Scanner(System.in);
					
		//sc.nest() 
		// : 다음 입력된 한 단어를 읽어옴
		// 	 공백(스페이스, 탭 등) 만나면 입력을 중단	
				
		//sc.nextLine
		// : 다음 입력된 한 줄을 읽어옴
		//	 공백과 함께 입력된 모든 내용을 입력받음	
				
//		System.out.print("입력 테스트: ");
//		String test = sc.nextLine();
//		System.out.print(test);
		
		System.out.print("입력1: ");
		String input1 = sc.nextLine();
		System.out.print("입력2: ");
		String input2 = sc.nextLine();
		System.out.print("입력3: ");
		String input3 = sc.nextLine();
		System.out.printf("%s %s %s", input1, input2, input3);
		
		
		
		
	}

}
