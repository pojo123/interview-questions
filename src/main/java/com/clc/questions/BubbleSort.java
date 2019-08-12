package com.clc.questions;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 1, 15, 40, 100, 5 };

		System.out.println("After bubble sort");

		sort(arr);
		printArray(arr);

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}

	public static int[] sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;

				}
			}
		}

		return array;
	}

}
