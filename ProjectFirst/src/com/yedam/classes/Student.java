package com.yedam.classes;

public class Student {
	String name;
	int age;
	double height;
	double weight;
	
	Student(){
		System.out.println("생성자");
	}
	
	Student(String name){
		this.name = name;
	}
	
	int sum(int a, int b)
	{
		int s = a + b;
		return s;
	}
	
	void study() {
		System.out.println("공부합니다.");
	}
	
	void exercise() {
		System.out.println("운동한다.");
	}
	
	void eat(String str) {
		System.out.println(str + "을 먹습니다.");
	}
}
