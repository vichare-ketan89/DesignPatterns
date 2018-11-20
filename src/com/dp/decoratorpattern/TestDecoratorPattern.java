package com.dp.decoratorpattern;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		
		Beverage beverage = new DarkRoastBeverage();
		beverage = new MilkCondiment(beverage);
		beverage = new MilkCondiment(beverage);
		beverage = new CreamCondiment(beverage);
		
		System.out.println("Total Cost of :: "+beverage.getDescription() + " is "+ beverage.getCost());
		
		
		Beverage beverage2 = new CappuccinoBeverage();
		beverage2 = new MilkCondiment(beverage2);
		beverage2 = new CreamCondiment(beverage2);
		beverage2 = new CreamCondiment(beverage2);
		
		System.out.println("Total Cost of :: "+beverage2.getDescription() + " is "+ beverage2.getCost());

		
		Beverage beverage3 = new EspressoBeverage();
		beverage3 = new MilkCondiment(beverage3);
		beverage3 = new CreamCondiment(beverage3);
		beverage3 = new CreamCondiment(beverage3);
		
		System.out.println("Total Cost of :: "+beverage3.getDescription() + " is "+ beverage3.getCost());

	}

}
