package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone_Re;
import com.kh.inheritance.model.dto.SmartPhone_Re;

public class Run_Re {

	public static void main(String[] args) {

		SmartPhone_Re smp = new SmartPhone_Re("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		smp.printInfo();
		
		System.out.println("=============================");
		
		
		
		BasicPhone_Re bsp = new BasicPhone_Re("Nokia", "3310", 2000, 100000, true);
		
		bsp.printInfo();
		bsp.checkKeyboard();
		
	}

}
