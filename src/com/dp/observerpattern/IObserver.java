package com.dp.observerpattern;

public interface IObserver {
	public void update(float temperature, float humidity, float windSpeed);
}
