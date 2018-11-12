package com.dp.strategypattern;

public class ServiceTwoWheeler implements IMaintainVehicle{
	
	@Override
	public void serviceVehicle() {
		System.out.println("Check middle engine. Check Two tyres. Check Carburator. Petrol Wash.");
	}

}
