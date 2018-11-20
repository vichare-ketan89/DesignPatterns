package com.dp.decoratorpattern;

public class CreamCondiment extends ExtrasDecorator{

	private Beverage mBeverage;
	
	public CreamCondiment(Beverage beverage) {
		mBeverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return mBeverage.getDescription() + "Cream ";
	}
	
	@Override
	public float getCost() {
		return mBeverage.getCost() + 0.7f;
	}
	
}
