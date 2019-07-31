package com.clc.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(11);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(33);
		list2.add(3);
		list2.add(4);
		
		List<Integer> union = new ArrayList<Integer>(list1);
		union.addAll(list2);
		System.out.println(union);
		
		
		List<Integer> intersection = new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		System.out.println(intersection);
		
		union.removeAll(intersection);
		System.out.println(union);

//		2nd way of convertion
		
		/*
		 * Make the two lists List<Integer> list1 = Arrays.asList(1, 2, 3, 11);
		 * //converting array to collection List<Integer> list2 =
		 * Arrays.asList(11,33,3,4); // Prepare a union List<Integer> union = new
		 * ArrayList<Integer>(list1); union.addAll(list2); // Prepare an intersection
		 * List<Integer> intersection = new ArrayList<Integer>(list1);
		 * intersection.retainAll(list2); // Subtract the intersection from the union
		 * union.removeAll(intersection); // Print the result for (Integer n : union) {
		 * System.out.println(n); }
		 */

	}

}
