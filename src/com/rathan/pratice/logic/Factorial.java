package com.rathan.pratice.logic;

public class Factorial {
	// 5*4*3*2*1
	
	static int x = 5;
	static int i =4;

	
 public static void main(String[] args) {

	 
	 for(int i=4;i>0;i--) {
		 x=x*i;
	 }
	 System.out.println("Using For loop"+x);
     x=5;
     
 while(i>0) {
	 x=i*x;
i--;
	}
 System.out.println("Using While loop"+x);

 }

}
