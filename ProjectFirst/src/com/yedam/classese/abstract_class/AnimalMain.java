package com.yedam.classese.abstract_class;

public class AnimalMain {
	public static void main(String[] args) {
		//Car car = new Car();
		
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		Animal cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
	}
}
