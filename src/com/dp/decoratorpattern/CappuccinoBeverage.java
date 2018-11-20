package com.dp.decoratorpattern;

public class CappuccinoBeverage extends Beverage{
	
	
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 2.5f;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Cappuccino ";
	}

}
