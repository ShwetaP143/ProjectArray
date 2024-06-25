package com.array;

public class SumofeventwoDarray {

	public static void main(String[] args) {
		int x[][] = {{2,5,9,0},{5,66},{88,93,44}};
		int add = 0;
		
		System.out.println("Even nums are as follows");
		for(int i=0 ; i<x.length ; i++) {
			for(int j=0 ; j<x[i].length ; j++) {
				if(x[i][j] % 2 == 0) {
					System.out.print(x[i][j]+" ");
					
				add = add + x[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Addition of even nums :"+add);
	}

}
