package com.clc.questions;

import java.util.Arrays;
import java.util.Collections;

public class AscenDesc {

	public static void main(String[] args) {

		Integer[] numbers = { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };

		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers)); // prints in ascending order
		

		Arrays.sort(numbers, Collections.reverseOrder());

		System.out.println(Arrays.toString(numbers)); // prints in descending order

	}

}
