package com.clc.questions;

public class Test extends A{
	
	public Test() {
		
		System.out.println("Test");
	}

	public void m1() {
		System.out.println("m1");
	}
	
	//public static void main(String[] args) {
//		
//		Test t=new Test();
//		t.m1();
//		 
//		A a = new A();
//		a.m1();
	//}
}

class A{
	
	public void m1() {
		System.out.println("m1 of A");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
	
}
