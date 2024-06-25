package com.array;

public class Palindronarray {

	public static void main(String[] args) {
		
		int num[] = {101,121,90,88,303};
		int a;
		int rem;
		int rev;
	    int b;
		
		for(int i=0 ; i<num.length ; i++) {
			a = num[i];
			b = a;
			rem=0;
			rev=0;
			
		   
			while(b!=0) {
			rem = b%10;
			rev = rev*10 + rem;
			  b = b/10;
			}
			if(a == rev) {
				System.out.println(a);
			}
			
		}
	}

}
