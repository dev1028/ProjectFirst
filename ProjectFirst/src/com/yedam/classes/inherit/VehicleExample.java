package com.yedam.classes.inherit;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus();
		vehicle.run();
		vehicle = new Taxi();
		vehicle.run();
		
		Taxi taxi = (Taxi)vehicle;
		//taxi.bus = 0;
	}

}
