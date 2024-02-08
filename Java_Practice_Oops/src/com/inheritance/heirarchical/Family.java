package com.inheritance.heirarchical;

public class Family {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		System.out.println(c1.a);
		c1.dad();
		
		System.out.println(c1.b);
		c1.elder();
		
		System.out.println("---------------------------------------");
		
		Child2 c2 = new Child2();                        // We can access parent class objects by creating two objects for two child classes
		System.out.println(c2.a);
		c2.dad();
		
		System.out.println(c2.c);
		c2.younger();

	}

}
