package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color) {
		super(model, color);
	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 방송을 수신.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료");
	}
}
