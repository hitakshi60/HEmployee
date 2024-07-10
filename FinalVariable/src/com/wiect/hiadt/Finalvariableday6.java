package com.wiect.hiadt;

public class Finalvariableday6 {
	
//final int x; // final var should be initialized at the time of decn.
	final int x=20;
	
	final static int y;
	
	final static int z=56;
	
	static {
		System.out.println("In static Block");
		y=67;
	}
//	instance method
	void change()
	{
		x=34; // can not reassigned
		y=23; // ----
		
	}
	static void show() {
//		System.out.println("X is" +x);// x is non static
		System.out.println(" Y is" +y);
		System.out.println("Z is" +z);
	}
//	public void valuex() {
//		System.out.println("X is" +x);
//	}
}

