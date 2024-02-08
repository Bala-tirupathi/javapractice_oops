package com.polymorphism.methodOverriding;

public class B extends A{
	int a = 44;
	public void bala() {
		System.out.println(super.a);
		super.bala();                            // by using super keyword we can method overriding
		System.out.println("Derived class");
	}
	
}
