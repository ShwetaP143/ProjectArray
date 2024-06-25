package com.array;

public class Foreacharray {

	public static void main(String[] args) {
	  int []x = {4,6,7,5,2};
	  
	  System.out.println("Even numbers : ");
	  for(int element : x) {
		  if(element % 2==0) {
			  System.out.println(element);
		  }
	  }

	}

}
