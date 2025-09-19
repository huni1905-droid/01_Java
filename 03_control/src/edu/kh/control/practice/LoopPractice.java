package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	 public void practice1(){
		 
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int input = sc.nextInt();
		 String result= "";
		 
		 if( input >=1 ) {
			 for(int i = 1; i<=input; i++) {
				 result += i + " ";
				 //System.out.print(i + " ");
			 }
			 
		 } else {
			 System.out.println("1 이상의 숫자를 입력해주세요.");
		 }
		 System.out.println(result);
	 }
	
	 public void practice2(){
		System.out.print("1이상의 숫자를 입력하세요 : "); 
		int input = sc.nextInt();
		String result = "";
		
		if(input >=1) {
			for(int i = input; i>=1; i--) {
				result += i + " ";
				//System.out.print(i + " ")
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		System.out.println(result);
	 }
	 
	 public void practice3(){
		 
		 System.out.print("정수를 하나 입력하세요 : ");
		 int input = sc.nextInt();
		 String result = 1 + "";
		 int sum = 1;
		 
		 for(int i =2; i <= input; i++) {
			
			 //if(i==input){ // 마지막 턴
			 //  	resutl += i;
			 //} else{//마지막이 아닌 이전 모든 턴들
			 //} 	result += i + " + ";
			 
			 result += " + " + i;
			 sum += i;
		 }
		 
		 System.out.printf("%s = %d", result, sum);
		 
	 }

		 
	 
	 public void practice4(){
		 System.out.print("첫 번째 숫자 : ");
		 int input1 = sc.nextInt();
		 System.out.print("두 번째 숫자 : ");
		 int input2 = sc.nextInt();
		 String result = "";
		 
		 if(input1<1 || input2<1) { //1미만의 숫자가 입력된 경우
			 System.out.println("1 이상의 숫자를 입력해주세요");
			
		 } else {//정상인 경우
			 
			 //일단 start에 첫번째 숫자, end에 두번째 숫자 대입
			 int start = input1;
			 int end = input2;
			 
			 //만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			 if(input1 > input2) {
				 start = input2;
				 end = input1;
			 }
			 
			 for(int i = start; i<=end; i++) {
				 System.out.println(i + " ");
				 
			 }
			 
		 }	 
			 
//			<내 풀이> 
//		 } else if(input1 > input2){
//			 for(int i = input2; i <= input1; i++) {
//				 result += i +" ";
//			 }
//			 System.out.println(result);
//			 
//		 } else {
//			 for(int i = input1; i <= input2; i++) {
//				 result += i +" ";
//			 }
//			 System.out.println(result);
//		 }
			 
			 
			 
	 }
	 
	
	 
	 public void practice5(){
		 
		 System.out.print("숫자 : ");
		 int dan = sc.nextInt();
		 
		 System.out.println("==== "+ dan +"단 ====");
		 
		 for(int num =1; num<=9; num++) {
			
				 System.out.printf("%d * %d = %d\n", dan, num, dan*num);
			 
		 }
		 
		 
		 
	 }
	 
	 public void practice6(){
		 
		 
		 System.out.print("숫자 " );
		 int input = sc.nextInt();
		 
		 if(input<2 || input>9) {
			 System.out.println("2~9 사이만 입력해주세요.");
			 
		 } else {
			 
			 //입력받은 숫자의 단부터 9단까지 단 증가하면서 반복출력
			 
			 for(int dan=input; dan<=9; dan++) { //단
				 System.out.println("==== "+dan+" 단 ====");
				 
				 for(int i=1; i<=9; i++ ) { //곱해지는 수
					 System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				 }
			 }
		 }
	 }
	 
	 public void practice7(){
		 
		 System.out.print("자연수 하나를 입력하세요 : ");
		 int input = sc.nextInt();
		 String result="";
		 int count=0;
		
		 for(int i = 1; i<=input; i++) {
			 
			 //2의 배수 또는 3의 배수인 경우 출력
			 if( i%2 ==0 || i%3 ==0 ) {
				 result += i + " ";
				 //System.out.print(i + " ");
				 if( i%2 ==0 && i%3 ==0 ) {
					 count++;
				 }
			 }


		 }
		 System.out.println(result);
		 System.out.println("count : " + count);
	 }
	 
}
