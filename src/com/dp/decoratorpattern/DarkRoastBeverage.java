package com.dp.decoratorpattern;

public class DarkRoastBeverage extends Beverage{
	
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 3.2f;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "DarkRoast ";
	}

}
