package com.clc.questions;

public class PracTest {

	static int i = 9;
	int j = 6;

	{
		System.out.println("instance block");
		System.out.println(i);
	}

	static {

		System.out.println("static block");
		
	}

	public void m2() {
		System.out.println("instance method");
		System.out.println(PracTest.i);
	}

	public static void m3() {
		PracTest t=new PracTest();
		System.out.println(t.j);
		System.out.println(i);
		t.m2();

	}

	public static void main(String[] args) {

		PracTest t = new PracTest();
		t.m2();
		PracTest.m3();
		System.out.println(i);
		System.out.println(t.j);
	}
}
