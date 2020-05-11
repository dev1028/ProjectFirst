package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 23;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.exercise();
		stu.eat("바나나");
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu.eat("사과");
		
		Student stu2 = new Student("Hoaaa");
		stu2.age = 30;
		stu2.eat("사과2");
		
		int result = stu2.sum(1, 2);
		
		
		
//		People p = new People();
//		p.maxAge = 100;
//		p.countHuman=1000;
//		p.maxHeight = 160;
//		p.Move("동");
//		p.Sleep();
//		p.ShowInfo();
	}
}
