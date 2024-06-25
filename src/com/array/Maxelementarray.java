package com.array;

public class Maxelementarray {
public static void main(String[] args) {
	
	
	int []x = {12,195,65,3,4,40};
	int max = x[0];
	int smax = x[0];
	
	for(int i=1; i<x.length ; i++) {
		if(x[i] > max) {
			max = x[i];
		}
	}
	System.out.println("Max element is "+max);
	
	for(int i=0 ; i<x.length ; i++) {
		if(x[i]>smax && x[i]<max) {
			smax = x[i];
		}
	}
	System.out.println("Second higest element is "+smax);
}
}
