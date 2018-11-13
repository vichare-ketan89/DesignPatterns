package com.dp.observerpattern;

public class DisplayHumidityObserver implements IObserver, IDsiplay{

	@Override
	public void displayInfo(float info) {
		System.out.println("Humidity is " + info);
		
	}

	@Override
	public void update(float temperature, float humidity, float windSpeed) {
		// TODO Auto-generated method stub
		displayInfo(humidity);
	}

}
