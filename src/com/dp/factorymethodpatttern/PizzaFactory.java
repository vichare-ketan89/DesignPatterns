package com.dp.factorymethodpatttern;

public abstract class PizzaFactory {

	
	public Pizza orderPizza(String basicVariety) {

		//get Pizza instance from  Pizza factory
		Pizza pizza = createPizza(basicVariety);
		
		prepare(pizza);
		addToppings(pizza);
		cut(pizza);
		
		System.out.println(pizza.getName() + " is ready for delivery");
		System.out.println("-----------------------------------------");
		
		return pizza;
	}
	
	public abstract  Pizza createPizza(String variety);
	
	private void prepare(Pizza pizza) {
		System.out.println("Putting "+ pizza.getName() + " in the Oven");
	}
	
	private void addToppings(Pizza pizza) {
		System.out.println("Adding topping to " + pizza.getName());
		
	}
	
	private void cut(Pizza pizza) {
		System.out.println("Cutting "+ pizza.getName());
	}
	
}
