package com.array;

public class SumofcubetwoDarray {

	public static void main(String[] args) {
		int x[][] = {{3,9},{5,2,4}};
		int add = 0;
		
		for(int i=0 ; i<x.length ;i++) {
			for(int j=0 ; j<x[i].length ; j++) {
				add = add + (x[i][j]*x[i][j]*x[i][j]);
			}
		}
         System.out.println("Sum of cubic values : "+ add);
	}

}

