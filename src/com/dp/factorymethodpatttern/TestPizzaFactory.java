package com.dp.factorymethodpatttern;

public class TestPizzaFactory {

	public static void main(String[] args) {
		
		PizzaFactory pizzaFactory = new NYPizzaFactory();
		pizzaFactory.orderPizza("Veg");
		pizzaFactory.orderPizza("Chicken");
		
		pizzaFactory = new ChicagoPizzaFactory();
		pizzaFactory.orderPizza("Cheese");

	}

}
