package com.array;

public class Array {
public static void main(String[] args) {
	int [] x = {10,20,30,40,50};
	int [] y = {60,70,80,90,100};
	
	
	for(int i=0 ; i<x.length ; i++) {
		for(int j=0 ; j<y.length ; j++) {
	       x[i] = x[i] + y[j];
	       y[j] = x[i] - y[j];
	       x[i] = x[i] - y[j];
	       }
		System.out.println("x : "+x[i] + " ");
		

	}
	
	   //    System.out.print(y[j]);
}
}
