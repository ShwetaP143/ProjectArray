package com.array;

import java.util.Scanner;

public class Decendingarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of elements you want in array : ");
	   int size = sc.nextInt();
	   int num[] = new int[size];
	   int temp = 0;
	   
	   System.out.println("Enter Elements in array : ");
	   for(int i=0 ; i<num.length ; i++) {
		   num[i]=sc.nextInt();
	   }
	   
	   for(int i=0 ; i<num.length ; i++){
		   for(int j=0 + i ; j<num.length ; j++) {
			    if(num[i] < num[j]) {
				   temp   = num[i];
				   num[i] = num[j];
				   num[j] = temp;
			   }
		   }
	   }
	   System.out.println("Decending Numbers : ");
	   for(int i=0 ; i<num.length ; i++) {
		System.out.print(num[i]+" ");
	   }   
   }
}
