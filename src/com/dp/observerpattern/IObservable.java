package com.dp.observerpattern;

public interface IObservable {
	public void subscribe(IObserver observer);
	public void unsubscribe(IObserver observer);
	public void notifyChange();
}
