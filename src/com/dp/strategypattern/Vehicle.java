package com.dp.strategypattern;

public abstract class Vehicle {
	
	private IMaintainVehicle maintainVehicle;
	private IStartVehicle startVehicle;
	
	public abstract void displayName();

	public IMaintainVehicle getMaintainVehicle() {
		return maintainVehicle;
	}

	public void setMaintainVehicle(IMaintainVehicle maintainVehicle) {
		this.maintainVehicle = maintainVehicle;
	}

	public IStartVehicle getStartVehicle() {
		return startVehicle;
	}

	public void setStartVehicle(IStartVehicle startVehicle) {
		this.startVehicle = startVehicle;
	}
	
	public void startVehicle() {
		startVehicle.startVehicle();
	}
	
	public void maintainVehicle() {
		maintainVehicle.serviceVehicle();
	}
}
