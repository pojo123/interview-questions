package com.clc.questions;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		String str="Hello World";
		/*
		 * String[] split = str.split(" "); for(String str1:split) {
		 * System.out.print(str1);
		 * 
		 * }
		 */
		
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(7,'t');
		System.out.println(sb);
	}

}
