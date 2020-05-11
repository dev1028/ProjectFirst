package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(20.3, 10.2));
		cal.powerOff();
		
	}

}
