package com.yedam.classes;

public class Calculator {
	String model;
	
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	
	double sum(double a, double b) {
		return a + b;
	}
	
	double getAreaRectangle(double w, double h) {
		return w * h;
	}
}
