package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	 public void practice1(){
		 int[] arr = new int[9]; 
		 
		 int sum = 0;
		 String output = "";
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = i+1;
			 
			 output = output + arr[i] + " ";
			 
			 if( (i+1) % 2 == 1) {
				 sum += arr[i];
				 
			 }
		 }
		 
		 System.out.println(output);
		 System.out.println("짝수 번째 인덱스 합 : " + sum);
	 }

	 public void practice2(){
		 
		 int[] arr = new int[9];
		 String output = "";
		 int sum = 0;
		 
		 for(int i=8; i >= 0; i--) {
			 arr[i] = i + 1;
			 output += arr[i] + " ";
					 
			 if((i+1)%2 == 0) {
				 sum += arr[i];
				 
			 }
		 }
		 
		 System.out.println(output);
		 System.out.println("홀수 번째 인덱스 합 : " + sum);
	 }
	 
	 
	 public void practice3(){
		 
		 System.out.print("양의 정수 : ");
		 int input = sc.nextInt();

		 int[] arr = new int[input];
		 String output = ""; 
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = i+1;
			 output += arr[i] + " ";
		 }
		 
		 System.out.println(output);
	 }
	 
	 
	 public void practice4(){
		 int[] arr = new int[5];
		 int input ;
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.print("입력" + i + " : " );
			 input = sc.nextInt();
			 arr[i] = input;
		 }
		 
		 
		 System.out.print("검색할 값 : ");
		 int search = sc.nextInt();
		 boolean flag = false;
		 
		 
		 for(int i=0; i<arr.length; i++) {
			 if((int)arr[i] == search) {
				 System.out.println("인덱스 : " + i);
				 flag = true;
			 } 
		 }
		 
		 if(!flag) {
			 System.out.println("일치하는 값이 존재하지 않습니다");
				
		 }

	 }
	 
	 public void practice5(){
		 
		 System.out.print("문자열 : ");
		 String input1 = sc.nextLine();
		 
		 char[] arr = new char[input1.length()];
		 
		 for(int i=0; i< arr.length; i++) {
			 arr[i] = input1.charAt(i);
			 
		 }
		 
		 System.out.print("문자 : ");
		 String input2 = sc.next();
		 
		 System.out.println(input1 + "에 " + input2 + "가 존재하는 위치(인덱스) : ");
		 
		 
		 
	 }
	 
	 public void practice6(){
	 
		 System.out.print("정수 : ");
		 int input = sc.nextInt();
		 
		 int[] arr = new int[input];
		 String output = "";
		 int sum = 0;
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			 arr[i] = sc.nextInt();
			 output += arr[i] + " ";
			 sum += arr[i];
			 
		 }
		 
		 System.out.println( output );
		 System.out.println("총 합 : " + sum );

		 
	 }
	 
	 public void practice7(){
		 
		 String input = "";
		 
		 System.out.println("주민등록번호(-포함) : ");
		 input = sc.nextLine();
		 
		 String[] arr = new String[14];
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = input.charAt(i);
			 
		 }
		 
		 
	 }
	 
}
