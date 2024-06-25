package com.array;

import java.util.Scanner;

public class Findelementarray {
public static void main(String[] args) {
	int []x = new int[5];
	int n=0;
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array of 5 elements : ");
	for(int i=0 ; i<x.length; i++) {
		x[i] = sc.nextInt();
	}
	
	System.out.println("Enter element to Search in array : ");
	n=sc.nextInt();
	
	for(int i=0 ; i<x.length ; i++) {
		if(n == x[i]) {
			count++ ; 
		}
	}
	if(count > 0) {
		System.out.println("Element is found");
	}else {
		System.out.println("Element is not found");
	}
}
}
