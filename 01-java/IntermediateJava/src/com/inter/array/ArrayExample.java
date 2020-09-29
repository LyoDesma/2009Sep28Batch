package com.inter.array;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String... args) {
		
		// different ways you can create arrays
		
		// you can have the [] after the datatype or after the variable name, including spaces
		int[] arr = new int[5];
		arr[0]=5;
		// Different ways to instantiate arrays, curly braces, array constructor for initial size, or all together.
		String[] s2 = new String[] {"wegergaer","eragaewrgreag","ergaergaer"};
		String[] s3 = {"gjnaegaerng","eargjinaegnreg"};
		
		// int [] arr;
		// int arr[]
		
		String[] fargs = new String[10];
		
		// iterate and fill an array
		for(int i = 0; i < fargs.length; i++) {
			fargs[i] = "i is: "+i;
		}
		
		// Enhanced for loop as an array
		for(String s : fargs) {
			System.out.println(s);
		}
		
		// var args will treat arguments as an array
		String[] s = retArray(new String[]{"egaegr","erhgegerg","theaeg"});
		System.out.println(s[0]);
		
		// Arrays
		// A static utlity class
		System.out.println(s);
		// toString
		System.out.println(Arrays.toString(s));
		
		// sort
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		// 2D arrays
		int [][] arr2 = new int[3][3];
		arr2 [0][1]=4333;
		
		for(int[] a : arr2) {
			for(int e : a) {
				System.out.println(e);
			}
		}
		
	}

	// this is known as var args
	static String[] retArray(String... arr) {
		return arr;
	}
	
}
