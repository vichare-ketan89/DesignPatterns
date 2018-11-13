package com.dp.observerpattern;

public class DisplayTempeartureObserver implements IObserver, IDsiplay{

	@Override
	public void update(float temperature, float humidity, float windSpeed) {
		displayInfo(temperature);
		
	}
	
	@Override
	public void displayInfo(float info) {
		System.out.println("Tempaerature is " + info);
	}

}
