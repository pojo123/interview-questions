package com.clc.questions;

public class StringOccurence {
	
	public static int reverse(String s,char c) {
		
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c)
				count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		String str="Hello World";
		
		char ch='o';
		System.out.println(reverse(str, ch));
		
	}

}
