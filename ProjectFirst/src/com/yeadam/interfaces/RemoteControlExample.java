package com.yeadam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
	}
}
