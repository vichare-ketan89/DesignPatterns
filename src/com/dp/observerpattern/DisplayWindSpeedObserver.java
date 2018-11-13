package com.dp.observerpattern;

public class DisplayWindSpeedObserver implements IObserver, IDsiplay{

	@Override
	public void displayInfo(float info) {
		System.out.println("Windspeed is " + info);
	}

	@Override
	public void update(float temperature, float humidity, float windSpeed) {
		displayInfo(windSpeed);
	}

	
}
