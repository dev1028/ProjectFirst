package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<5; ++i) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HanKookTire로 교체");
				car.frontleftTire = new HanKookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른족 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 16);
				break;
			case 3:
				System.out.println("뒤왼쪽 HanKookTire로 교체");
				car.backLeftTire = new HanKookTire("뒤왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤오른족 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 16);
				break;
			case 0:
				break;
			}
			System.out.println("=============================");
		}
	}
}
