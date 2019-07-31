package com.clc.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCount {

	public static void main(String[] args) {
		
		//ArrayList<String> al = new ArrayList<String>();
		List<String> al = new ArrayList<String>();
		al.add("cat");
		al.add("pig");
		al.add("dog");
		al.add("pig");
		al.add("horse");
		al.add("camel");
		al.add("pig");
		
		System.out.println(al);
		
		System.out.println(Collections.frequency(al, "pig"));

	}

}
