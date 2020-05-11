package com.yedam.classes;

public class People {
	String countHuman;
	int maxAge;
	int maxHeight;
	
	People(String count, int age, int height)
	{
		this.countHuman = count;
		this.maxAge = age;
		this.maxHeight = height;
	}
	
	void Move(String str) {
		System.out.println(str + "쪽으로 이동");
	}
	
	void Sleep() {
		System.out.println("수면");
	}
	
	void ShowInfo() {
		System.out.println("=====ShowInfo====");
		System.out.println("countHuman: " + countHuman);
		System.out.println("maxAge: " + maxAge);
		System.out.println("maxHeight: " + maxHeight);
	}

}
