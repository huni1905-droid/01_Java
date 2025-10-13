package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
		
		
		
		
	}
	
	
	
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요 : ");
		for(Animal animal : animals) {
			animal.sound();
		}
		
		
		
	}
	
	
	
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			try {
				System.out.println("****** KH 동물원 ******");
				System.out.println("1. 동물들의 울음소리");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch(menuNum) {
				case 1: System.out.println("동물들의 울음소리를 들어보세요 : "); break;
				
				case 2: System.out.println("프로그램을 종료합니다"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요");		
					
				}
				
			}catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다." + "다시 시도해주세요.");
				
				sc.nextLine();
				
			}	
			
		} while( menuNum != 2);			
			

	}

	
	
	
	
	

	
	
}
