package com.polymorphism.methodOverloading;

public class Overload {
	public void add() {
		System.out.println("vizag");
	}
	public void add(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void add(int x, int y, int z) {
		int t = x+y+z;
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.add();
		ol.add(10, 20);
		ol.add(10, 30, 50);

	}

}


/* Method over loading         v/s           Method Overriding
 * ->Compile time polymorphism             Run time polymorphism
 * ->Implemented in a single class         Implemented in two classes
 * ->No need inheritance                   Need Inheritance concept
 * ->Method name should be same            Method name should be same
 * ->Diff parameters                       same parameters
 * ->Return type can be different          Return type should be same
 * ->STATIC METHODS CAN BE OL              STATIC METHODS CANT BE OR
 * ->Early binding                         Late binding
 *                                         Methods declared with FINAL keyword cant be override*/
 