package com.inheritance.single;

public class Bala {

	public static void main(String[] args) {
		SmartMobile obj = new SmartMobile();
		
		System.out.println(obj.a);                   // These are parents class objects
		obj.bubbleGame();
		
		System.out.println(obj.b);                  // These are child class objects
		obj.pubg();

	}

}
