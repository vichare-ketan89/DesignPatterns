package com.dp.observerpattern;

public class TestObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
		weatherDataObservable.setValues(25.2f, 80, 45);
		
		IObserver temperatureObserver = new DisplayTempeartureObserver();
		weatherDataObservable.subscribe(temperatureObserver);
		
		IObserver humidityObserver = new DisplayHumidityObserver();
		weatherDataObservable.subscribe(humidityObserver);
		
		IObserver windSpeedbserver = new DisplayWindSpeedObserver();
		weatherDataObservable.subscribe(windSpeedbserver);

		weatherDataObservable.setValues(27.2f, 83, 35);
		
		weatherDataObservable.unsubscribe(windSpeedbserver);
		
		weatherDataObservable.setValues(37.2f, 63, 65);
		
	}

}
