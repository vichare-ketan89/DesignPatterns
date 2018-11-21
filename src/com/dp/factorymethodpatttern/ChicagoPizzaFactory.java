package com.dp.factorymethodpatttern;

public class ChicagoPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String variety) {
	
		switch (variety) {
		case "Veg":
			return new ChicagoVegPizza();
			
		case "Chicken":
			return new ChicagoChickenPizza();
			
		case "Cheese":
			return new ChicagoCheesePizza();

		default:
			return null;
		}
	}
	
}
