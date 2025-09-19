package edu.kh.op.practice;

import java.util.Scanner;
//ctrl + shift + o : 자동 임포트


//기능 제공용 클래스
public class OperatorPractice {
				//매서드명
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");		
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");		
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕개수 : %d\n", input2 / input1);
		System.out.printf("남는 사탕 개수 : %d\n", input2 % input1);
		
//		int num1 = input2 / input1;
//		System.out.print("1인당 사탕 개수 : " + num1 );
//		
//		System.out.println();
//		
//		int num2 = input2 % input1;
//		System.out.print("남는 사탕 개수 : " + num2 );
		

				
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String input3 = sc.nextLine();
		System.out.print("학년 : ");
		int input4 = sc.nextInt();
		System.out.print("반 : ");
		int input5 = sc.nextInt();
		System.out.print("번호 : ");
		int input6 = sc.nextInt();
		
		sc.nextLine(); // 개행문자 제거용(입력버퍼에 남은 개행문자 비우기)
					   // next, nextInt, nextDouble 은 공백을 받지 않아
				       //-> Enter누르면 공백 나와서 공백제거 필요
		
		System.out.print("성별(남학생/여학생) : ");
		String input7 = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째자리) : ");
		double input8 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", 
						input4, input5, input6, input3, input7, input8);
		
	}	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		int sum = kor + eng + math; //합계
		System.out.println("합계 : " + sum );
		
		double ave = (kor + eng + math) / 3.0; //평균
		System.out.printf("평균 : %.1f", ave);
		
				
	
	//문제4
	//각 과목이 40점 이상이고, 
	//평균 60점 이상이어야 합격
	//그 외 불합격 출력
	

		
//		boolean result (kor >=40) && (eng >=40) && (math>=40) && (ave >=60);
//		
//		System.out.println(result ? "합격" : "불합격");
//						//조건식? true수행 : flase수행
	}

	
	
	
	
}
