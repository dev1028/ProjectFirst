package com.yedam.classes.inherit;

public class HanKookTire extends Tire{
	
	public HanKookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			int k = maxRotation - accumulatedRotation;
			System.out.println(location + " HanKookTire 수명 :" + k + "회 ");
			return true;
		}else {
			System.out.println("*** " + location + " HanKookTire 펑크 ***");
			return false;
		}
	}
}
