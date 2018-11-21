package com.dp.factorymethodpatttern;

public class NYPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String variety) {
	
		switch (variety) {
		case "Veg":
			return new NYVegPizza();
			
		case "Chicken":
			return new NYChickenPizza();
			
		case "Cheese":
			return new NYCheesePizza();

		default:
			return null;
		}
	}
	
}
