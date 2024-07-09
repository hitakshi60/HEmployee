package com.wiect.hiadt;

public class Classroom {
private int section;

private static int srNO;
// static block
static {
	System.out.println("in S B ");
	srNO =10;
//	section=1; only allow static member ,non static member not allowed
}
public Classroom() {
	System.out.println("inside const");
	section++;
	srNO++;
}
@Override
public String toString() {
	return "Classroom [section=" + section + "]";
}
static void display() {
	System.out.println("sr No is"+srNO);
	
}
public void show()
{
	System.out.println("sr No is"+srNO);
	System.out.println("sr No is"+section);
	}
}
