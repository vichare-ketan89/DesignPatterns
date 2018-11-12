package com.dp.strategypattern;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bike();
		vehicle.displayName();
		vehicle.setMaintainVehicle(new ServiceTwoWheeler());
		vehicle.setStartVehicle(new StartTwoWheeler());
		vehicle.maintainVehicle();
		vehicle.startVehicle();
		
		System.out.println("----------------");
		
		vehicle = new AutoRickshaw();
		vehicle.displayName();
		vehicle.setMaintainVehicle(new ServiceThreeWheeler());
		vehicle.setStartVehicle(new StartThreeWheeler());
		vehicle.maintainVehicle();
		vehicle.startVehicle();
		
		System.out.println("----------------");
		
		vehicle = new Truck();
		vehicle.displayName();
		vehicle.setMaintainVehicle(new ServiceFourWheeler());
		vehicle.setStartVehicle(new StartFourWheeler());
		vehicle.maintainVehicle();
		vehicle.startVehicle();

	}

}
