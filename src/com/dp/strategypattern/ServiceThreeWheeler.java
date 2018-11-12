package com.dp.strategypattern;

public class ServiceThreeWheeler implements IMaintainVehicle{

	@Override
	public void serviceVehicle() {
		System.out.println("Check backside engine. Check Three wheels. Check engine. Wash.");
		
	}
}
