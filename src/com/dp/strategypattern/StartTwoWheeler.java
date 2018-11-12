package com.dp.strategypattern;

public class StartTwoWheeler implements IStartVehicle{

	@Override
	public void startVehicle() {
		System.out.println("Put the Key. Kick to start.");
		
	}
}
