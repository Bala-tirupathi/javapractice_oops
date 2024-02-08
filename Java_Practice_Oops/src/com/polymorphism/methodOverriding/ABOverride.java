package com.polymorphism.methodOverriding;

public class ABOverride {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a);
		obj.bala();
		
//		A op = new A();
//		System.out.println(op.a);            // Uncoment this part and comment super keyword part in the B class(sub class)
//		op.bala();

	}

}
