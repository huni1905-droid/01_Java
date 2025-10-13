package com.hw1.model.dto;

import java.util.concurrent.SubmissionPublisher;

import javax.security.auth.Subject;

public class Poetry extends Book{

	private int numberOfPoems;
	
	public Poetry() {}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %s",
				super.getTitle(), super.getAuthor(), numberOfPoems);
	}
	
	
}
