package com.clc.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(5);
		list.add(7);
		
		System.out.println(list);
		
		Set set = new HashSet();
		set.addAll(list);
		
		System.out.println(set);
	}

}
