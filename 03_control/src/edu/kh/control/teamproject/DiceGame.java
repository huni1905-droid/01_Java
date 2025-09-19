package edu.kh.control.teamproject;

import java.util.Scanner;

public class DiceGame {
	
	public void ex() {
		
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		int com = 0;
		int count = 0;
		int win = 0;
		double correctAvg = 0;
		String str = "";
		
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요.(종료하려면 \"종료\" 입력)\n");
		
		System.out.print("숫자 입력 >> ");
		input = sc.nextInt();
		
		com = (int)(Math.random() * 6 + 1);
		

		while(str != "종료" ) {

			if(sc.hasNextInt()) {
				input = sc.nextInt();
				System.out.println( input);
	
			}else {
				str = sc.next();
				System.out.println(str);


			System.out.print("숫자 입력 >> ");
			input = sc.nextInt();


			
			if( input < 1 || input > 6 ) {
				
				System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");

				
			} else {
				if(input < com) {
					System.out.println("틀렸습니다. 더 큰 수를 입력하세요.\n");
						
				} else if(input > com) {
					System.out.println("틀렸습니다. 더 작은 수를 입력하세요.\n");
				
				
				} else {
					System.out.println("정답입니다.");
					System.out.println("새로운 주사위 숫자가 생성되었습니다.");
					System.out.println();
					win++;
					
				}
				
				count++;
				correctAvg = win / count;
				
				System.out.println(count);
				System.out.println(win);
				System.out.println(correctAvg + "%");
				
					
	
		
		
			}
			}
		}
	}
	
}


