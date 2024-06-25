package com.array;

public class OddnostwoDarray {
public static void main(String[] args) {
	int x[][] = {{2,5,4},{9,0,6,83},{11,65,70,33}};
	int add=0;
	
	System.out.println("Odd numbers are as follows");
	for(int i=0 ; i<x.length ; i++) {
		for(int j=0 ; j<x[i].length ; j++) {
			
				if(x[i][j] % 2 !=0) {
				System.out.print(x[i][j]+" ");
				
				add = add + x[i][j];
				
			}
       }
	}
	System.out.println();
	System.out.println("Addition of odd nums : "+add);
}
}
