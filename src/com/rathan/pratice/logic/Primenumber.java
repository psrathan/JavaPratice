package com.rathan.pratice.logic;

public class Primenumber {
	static int i = 1;
	static int j = 1;
	static int num = 0;
	static int count=0;
	public static void main(String[] args) {

		for (int i = 1; i < 98; i++) {
			 count = 0; 
				for (int j = 1; j <=i; j++) {
					if (i % j == 0)
						count++;
			}
				if (count==2)
				System.out.println("prime number is" + i);

			}

		}

	}

