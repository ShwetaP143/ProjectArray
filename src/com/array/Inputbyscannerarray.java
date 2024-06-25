package com.array;

import java.util.Scanner;

public class Inputbyscannerarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int length = sc.nextInt();
		 
	    System.out.println("Enter Numbers : ");
	    int x[] = new int[length];
		 
		 for(int i=0 ; i<length ; i++) {
			  x[i] = sc.nextInt();
		 }
		 for(int i=0 ; i<x.length ; i++) {
			 System.out.print(x[i] + " ");
			 
			 System.out.println();
		 }	 
	}
}