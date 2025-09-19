package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {

//		int iNum1 = 10;
//		int iNum2 = 4;
//		float fNum = 3.0f;
//		double dNum = 2.5;
//		char ch = 'A';
//		
//		System.out.println( iNum1 /iNum2 ); // 2
//		
//		System.out.println( (int)dNum ); // 2
//		
//		System.out.println( iNum2 * dNum ); // 10.0
//			//자동형변환 적용
//			// 4.0 * 2.5 = 10.0
//		
//		System.out.println( (double) iNum1 ); // 10.0
//		
//		System.out.println( iNum1 / (float)iNum2 ); // 2.5
//			//  10.0 / 4.0 = 2.5 
//		
//		System.out.println( dNum ); // 2.5*
//		
//		System.out.println( (int)fNum ); // 3*
//		
//		System.out.println( iNum1 / (int)fNum ); // 3
//		
//		System.out.println( iNum1 / fNum );// 3.3333333
//		// float : 소수점 아래 8번째 자리까지 연산 후 반올림
//		//         double보다 정밀도가 낮다 
//		
//		System.out.println( iNum1 /(double)fNum ); // 3.3333333333333335
//		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
//		//          정밀도가 높아 마지막 값이 5
//		
//		System.out.println( "'" + ch + "'" ); // 'A'*
//		
//		System.out.println( (int)ch ); // 65
//		
//		System.out.println( ch + iNum1 ); // 75
//		
//		System.out.println( "'" + (char)(ch + iNum1) + "'"); // 'K'
//----------------------------------------------------------
//변수 형변환 마무리 연습문제
		//문제1
			int age =25;
			System.out.println("나는 "+age+"살입니다.");
			
		//문제2
			int score =90;
			score = score + 10;
			// score +=10; 과 같은 뜻이다.
			System.out.println("최종 점수 : " + score);
			
		//문제3
			int a =10;
			double b = a;
			System.out.println("a = " +a);
			System.out.println("b = " +b);
			
		//문제4
			double pi = 3.14159;
			int num =(int)pi;
			System.out.printf("pi = %.2f, num =%d\n", pi, num);	
			
		//문제5
			char ch ='A';
			int code = ch;//자동형변환 char -> int
			System.out.printf("문자:%c, 코드값:%d\n", ch, code);
			
		//문제6
			final int PRICE = 5000;
			int count = 3;
			int total = PRICE*count;
			System.out.println("물건 가격:"+ PRICE +"원, 개수:" 
					+ count+"개, 총액:" + PRICE*count +"원");
			System.out.printf("물건 가격:%d원, 개수:%d개, 총액:%d원\n"
					  					,PRICE,  	count,		total);
		//문제7
			
			int kor=95, eng=87, math=90;
			//int kor = 95;
			//int eng = 87;
			//int math = 90;과 동일
			int sum = kor + eng + math;
			double ave = sum / 3.0;  //주의! 3으로 나누면 둘 다 int 값이어서 정수 값으로 나온다
			System.out.printf("국어: %d, 영어:%d, 수학:%d\n",kor, eng, math);
			
		//응용문제
		//문제1 
			String name = "영숙";
			int age2 = 28;
			double height = 165.7;
			
		//문제2	
			System.out.printf("출연자 이름:%s\n나이:%d\n키:%.1f\n",name, age2, height);
			System.out.printf("출연자 이름:%s\n", name);
			System.out.printf("나이: %d\n", age2);
			System.out.printf("키: %.1fcm\n", height);
			
		//문제3	
			double doubleAge= age2;
			System.out.println("자동형변환된나이(double):" + doubleAge);
		
		//문제4
			int intheight = (int)height;
			System.out.println("강제 형변환된키(int):" + intheight);
			
		//문제5
			int score1=87, score2=92;
			double avgScore = (score1 + score2) / 2.0;
			System.out.printf("%s의 매칭 점수 평균은 %.1f점입니다!", name, avgScore);
			
					
			
	}

}
