package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; // 타이어 수명
	public int accumulatedRotation; // 현재 사용된 회전 수
	public String location;
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.accumulatedRotation = 0;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			int k = maxRotation - accumulatedRotation;
			System.out.println(location + " Tire 수명 :" + k + "회 ");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
