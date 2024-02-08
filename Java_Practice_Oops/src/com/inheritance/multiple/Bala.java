package com.inheritance.multiple;

public class Bala implements Dad, Mom {

	@Override
	public void momCar() {
		System.out.println("This is mom car");
		
	}

	@Override
	public void momBike() {
		System.out.println("This is mom bike");
		
	}

	@Override
	public void dadCar() {
		System.out.println("This is dad car");
		
	}

	@Override
	public void dadBike() {
		System.out.println("This is dad bike");
		
	}

}
