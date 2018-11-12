package com.dp.strategypattern;

public class ServiceFourWheeler implements IMaintainVehicle{
	
	@Override
	public void serviceVehicle() {
		System.out.println("Check four tyres. Check engine. Wash.");	
	}

}
