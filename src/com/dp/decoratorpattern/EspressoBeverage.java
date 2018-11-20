package com.dp.decoratorpattern;

public class EspressoBeverage extends Beverage{
	
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 4.0f;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Expresso ";
	}
}
