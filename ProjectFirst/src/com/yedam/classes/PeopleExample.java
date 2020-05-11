package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People p1 = new People("10", 20, 30);
		People p2 = new People("40", 50, 60);
		People p3 = new People("70", 80, 90);
		
		People[] arr = new People[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		for(int i=0 ;i<3; ++i){
			arr[i].ShowInfo();
		}
		
		for(People p : arr) {
			if(p.countHuman.equals("10")) {
				System.out.println("ASFDsfdaASFD: " + p.countHuman);
			}
		}
		
	}
}
