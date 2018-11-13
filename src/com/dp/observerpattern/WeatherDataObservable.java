package com.dp.observerpattern;

import java.util.ArrayList;

public class WeatherDataObservable implements IObservable{
	
	private float temperature, humidity, windSpeed;
	
	private ArrayList<IObserver> mObservers;
	
	public WeatherDataObservable() {
		mObservers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(IObserver observer) {
		mObservers.add(observer);
	}
	
	@Override
	public void unsubscribe(IObserver observer) {
		if(mObservers.indexOf(observer) != -1) {
			mObservers.remove(mObservers.indexOf(observer));
		}
	}

	
	@Override
	public void notifyChange() {
		for (IObserver observer : mObservers) {
			observer.update(temperature, humidity, windSpeed);
		}
	}
	
	public void setValues(float temperature, float humidity, float windSpeed) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
		notifyChange();
	}
}
