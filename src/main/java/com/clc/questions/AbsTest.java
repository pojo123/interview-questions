package com.clc.questions;

public class AbsTest extends Abs{


@Override
void m1() {
	System.out.println("m1");
	
}

@Override
void m2() {
	System.out.println("m2");
	
}

@Override
void m3() {
	System.out.println("m3");
	
}

public static void main(String[] args) {
	
	AbsTest abs= new AbsTest();
	abs.m1();
}

}