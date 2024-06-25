package com.array;

public class AddtwoDarray {
	public static void main(String[] args) {
		int[][] x= {{1,2},{3,4}};
		int[][] y= {{5,7},{8,9}};
		int[][] z= new int[2][2];
		
		for(int i=0; i<x.length;i++) {
		for(int j=0 ; j<y.length ; j++) {

			System.out.print(x[i][j]+" ");
			System.out.print(y[i][j]+" ");
			
			z[i][j]=x[i][j]+y[i][j];
			System.out.println("Addition : " + z[i][j] );
		}
		System.out.println();
			}
			
		}
	
}
