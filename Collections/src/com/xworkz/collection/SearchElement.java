package com.xworkz.collection;

public class SearchElement {

	public static int search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 79, 809, 30, 8 };
		int key = 79;
		System.out.println(key + " is found at index " + search(arr, key));
	}
}
