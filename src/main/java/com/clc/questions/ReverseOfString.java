package com.clc.questions;

public class ReverseOfString {
	
	public static void main(String[] args) {
		
		String str= "radar";
		String result= "";
		
		for(int i= str.length()-1; i>=0; i--) {
			
			result=result+str.charAt(i);
		}
		
		if (str.equals(result)) {
			System.out.println("This string is palindrome");
		} else {
            System.out.println("This string is not palindrome");
		}
		
		System.out.println(result);
	}

}
