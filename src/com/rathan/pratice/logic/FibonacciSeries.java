package com.rathan.pratice.logic;

public class FibonacciSeries {
	 int x = 0;
	 int y = 1;
	 int z = 0;
	 int j = 0;
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries= new FibonacciSeries();
		fibonacciSeries.m1();
		fibonacciSeries.m2();
	}
	public void m1() {
		for (int i = 0; i < 10; i++) {
			z = x + y;
			System.out.println("Using For Loop" + z);
			x = y;
			y = z;
		}
	}

	public void m2() {
		x = 0;
		y = 1;
		while (j < 10) {
			z = x + y;
			System.out.println("Using While Loop" + z);
			x = y;
			y = z;
			j++;
		}
	}

}
