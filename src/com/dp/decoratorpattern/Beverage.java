package com.dp.decoratorpattern;

public abstract class Beverage {
	private float cost;
	private String description = "Unknown Beverage";
	
	public abstract float getCost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
