package com.rathan.pratice.logic;

public class Armstrong {
	static int num = 153;
	static int sum = 0;
	static int r = 0;

	public static void main(String[] args) {
		// 153 1*1*1+5*5*5+3*3*3
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = r * r * r + sum;
}
		num=153;
		
		if (num == sum) {
			System.out.println("its armstrong");
		} else {
			System.out.println("its not armstrong");

		}

	}
}
