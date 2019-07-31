package com.clc.questions;

import java.util.regex.Pattern;

public class ReverseSentence {
	
	public static void main(String[] args) {

		String s= "I love India";
		Pattern pattern = Pattern.compile("\\s"); 
		String[] str=pattern.split(s);
		String result= "";
		
		
		
		for (int i = 0; i<str.length; i++) {
			if(i==str.length - 1)	
			result =str[i]+result;
			else
				result =" "+str[i]+result;
		}

		System.out.println(result);
	}


}
