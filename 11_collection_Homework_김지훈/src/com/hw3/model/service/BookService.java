package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookService {

	private List<Object> bookList = new ArrayList<Object>();
	
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		
		int menuNum = sc.nextInt();
		
		do{
			try {
				
				System.out.println("===도서 목록 프로그램===");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");
				
				System.out.println("메뉴를 입력하세요 : ");
				menuNum = sc.nextInt();
				
				switch (menuNum) {
				case 1 : /* addbook(); */ break; 
				case 2 : /* selectAll(); */ break; 
				case 3 : /* updateBook(); */ break; 
				case 4 : /* removeBook(); */ break; 
				case 5 : /* addFavorite(); */ break; 
				case 6 : /* removeFavorite(); */ break; 
				case 7 : /* selectFavorite(); */ break; 
				case 8 : /* addbook(); */ break; 
				case 0 : System.out.println("프로그램을 종료합니다."); break; 
				default: System.out.println("메뉴에 작성된 번호만 입력하세요");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				
				sc.nextLine();
				
				menuNum = -1;
				
			}
			
		}while(menuNum != 0);
			
		
	
			
			
		}
		
	public int addbook() {
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		if(bookList.add(new )) {
			
		}
		
		
		
	}
}
