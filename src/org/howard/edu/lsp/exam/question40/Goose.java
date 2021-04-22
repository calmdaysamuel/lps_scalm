package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	
	@Override
	void speak() {
		System.out.println("This Goose speak");
	}
	@Override
	void move() {
		System.out.println("This Goose moves forward");
	}
	@Override
	public void fly() {
		System.out.println("This Goose flies");
	}
	
}
