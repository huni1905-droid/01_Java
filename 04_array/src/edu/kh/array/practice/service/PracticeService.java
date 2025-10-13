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
	 
	 //<>내 풀이와 비교
	public void practice7() {

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();

		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {

			if (i <= 7) { // 7번 인덱스 이하 (생년월일, -, 성별)
				arr[i] = input.charAt(i);
			} else { // 8번 인덱스 이상부터는 *
				arr[i] = '*';
			}

			System.out.print(arr[i]);
		}

	}
	 //<내 풀이>
	 public void practice7My(){
		 
		 System.out.print("주민등록번호(-포함) : ");
		 String input = sc.nextLine();
		 
		 char[] arr = new char[input.length()];
		 //입력받은 문자열의 길이만큼 char배열 할당
		 
		 for(int i =8; i < arr.length; i++) {
			 arr[i] = '*';
		 }
	 
		 String output = "";
		 
		 for(int i=0; i<arr.length; i++) {
			 output += arr[i];
		 }
		 
		 System.out.println(output);
		 
	 }	 
	 
	 
	//<내 풀이와 비교>	
	public void practice8() {

		while (true) {
			// 3 이상의 수가 입력 될 때 까지 무한 반복
			// -> 3 이상 홀수가 입력되면 원하는 코드 수행 후 break문 으로 종료 예정

			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
					System.out.println("다시 입력하세요!");

			} else {
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];

				int num = 0; // arr 배열에 대입될 값

				for (int i = 0; i < arr.length; i++) {

					// 요소에 값 대입하기
					if (i <= arr.length / 2) { // 중간 이전까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}

					// 각 요소에 대입된 값 출력하기
					// 출력 시 , 추가 (단, 마지막 제외)
					if (i == arr.length - 1) { // 마지막 바퀴
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}

				} // for문끝

				break; // while 반복 멈춤

			}

		}

	}
	 //<내 풀이>	 
	public void practice8My(){
		 System.out.print("정수 : ");
		 int input = sc.nextInt();
		 String output1="";
		 String output2="";
		 
		 while((input%2 == 0) || (input <=3)) {
			 System.out.println("다시 입력하세요.");
			 
			 System.out.print("다시 입력하세요 : ");
			 input = sc.nextInt();
		 }
		
		 for(int i = 1; i<(input/2 + 1); i++) {
			 output1 += i + ", ";
		 }
		 for(int i = input/2; i>0; i--) {
			 output2 += ", " + i ;
		 }
		 
			 System.out.println(output1 + (input/2 +1) + output2);
	 }
	 
		 
	 public void practice9(){
		 
		int[] arr = new int[10];
		String output = "";
		
		for(int i=0; i<10; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			output += arr[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + output);
		
	 }
		 
//<내 풀이와 비교>	 
	public void practice10() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int max = 1; // 최대값을 담아줄 변수
		int min = 10; // 최소값을 담아줄 변수

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) { // 해당 인덱스의 값이 max보다 큰경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}

			if (arr[i] < min) { // 해당 인덱스의 값이 min보다 작은경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}

		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	
	 //<내 풀이>	
	 public void practice10My(){
		int[] arr = new int[10];
		String output = "";

		for(int i=0; i<arr.length; i++) { 
				
			arr[i] = (int)(Math.random() * 10 + 1);
			output += arr[i] + " ";

		}
			
		int max = arr[0];
		int min = arr[0];
			
		   for(int i=1; i<arr.length; i++) {
			   if(max > arr[i]) {
						
			   } else{
				   max = arr[i];
			   }
				
				
			   if(min < arr[i]) {
					
			   } else {
				   min = arr[i];
			   }	
		   }
		    
		System.out.println("발생한 난수 : " + output);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
			
	}
	 
			
	public void practice11(){
			
		int[] arr = new int[10];
		String result = "";
			
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1 );

			for(int x=0; x<i; x++) {
				if(arr[i] == arr[x]) {
					i--;
					break;
				} 
			}
				
		}
			
		for(int i=0; i<arr.length; i++) {
				
			result += arr[i] + " ";
				
		}
		System.out.println(result);
			
	}
		
		
	public void practice12(){
		// 크기가 6인 정수형 배열 선언 및 할당
		int[] arr = new int[6];
		String result = "";
		
		//배열에 중복값 없이 1부터 45 사이의 난수 초기화	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) { // 중복 제거
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
			
		Arrays.sort(arr); //오름차순 정렬
		
		// 출력
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); //***변수 하나 더 만들지 말고 그냥 프린트문에 집어넣기
		}

	}
		
		
	public void practice13(){
			
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		int count =0;
			
		char[] arr = new char[input.length()];
			
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
			count++;
		}
			
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr));

		System.out.print("문자 개수 : " + count);
	}
		

//<내 풀이와 비교>	
	public void practice14() {

		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

		String[] arr = new String[size];

		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);

			// 4. 값을 더 입력할 경우
			if (ch == 'y' || ch == 'Y') {

				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
	
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];

				// 7. 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < newArr.length; i++) {

					if (i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사

					} else { // 인덱스의 크기가 기존배열 보다 클 경우 (새로운 값 입력받기)
					System.out.print((i + 1) + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
					}

				}

				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
				// 더 입력? y
				// 위 코드를 반복할때 기존 배열인 arr의 길이를 기준으로
				// 새 배열(newArr)의 크기를 할당하기 때문에
				arr = newArr;

			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료

			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}

		}

		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));

	}	
		
		
		//<내 풀이>
		public void practice14My(){
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		sc.nextLine();//***입력버퍼 제거용!!
		
		String[] arr1 = new String[input1];
		String result = "";		
		
		// 2. 첫 배열에 저장할 문자열 입력받기	
		for(int i=0; i<input1; i++) {
				
			System.out.print((i+1) + "번째 문자열 : ");
			arr1[i] = sc.next();
				
			if(i==0) {
				result = arr1[0];
					
			} else {
				result += ", " + arr1[i];
					
			}
					
		}
		
		// 3. 반복이 시작되는 구간부터 while 작성
		//      내부에 종료조건 만들어 break 이용하여 멈춤
		System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
		char yesOrNo = sc.next().charAt(0);
			
		while(yesOrNo == 'y') {
			System.out.print("더 입력하고 싶은 개수 : ");
			int input2 = sc.nextInt();
			sc.nextLine();// ***입력버퍼에 남은 개행문자 제거
			
			String[] arr2 = new String[input2];
				
			for(int i=0; i<input2; i++) {
					
				System.out.print((i+1) + "번째 문자열 : ");
				arr2[i] = sc.next();
					
					result += ", " + arr2[i];
					
			}
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			yesOrNo = sc.next().charAt(0);
		}
			
		System.out.println("[" + result + "]");
			
			
			
	}
		 
		 
	 
	 
	 
	 
	 
	 
	 
}
