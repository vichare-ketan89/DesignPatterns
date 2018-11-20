package com.dp.decoratorpattern;

public class MilkCondiment extends ExtrasDecorator{

	private Beverage mBeverage;
	
	public MilkCondiment(Beverage beverage) {
		mBeverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return mBeverage.getDescription() + "Milk ";
	}
	
	@Override
	public float getCost() {
		return mBeverage.getCost() + 1.0f;
	}
}
