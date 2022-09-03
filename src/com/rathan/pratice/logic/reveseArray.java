package com.rathan.pratice.logic;

public class reveseArray {

	public static int[] reverseArray(int[] y) {

		int rs = 0;
		for (int i = 0; i < y.length / 2; i++) {
			rs = y[i];
			y[i] = y[(y.length - 1 - i)];
			y[(y.length - 1 - i)] = rs;

		}

		return y;

	}

	public static void main(String[] args) {

		int[] y = { 78, 80, 97, 45, 12, 19, 55, 40, 17 };

		int f[] = reverseArray(y);

		for (int i = y.length - 1; i >= 0; i--) {

			// System.out.println("reverse oder" + y[i]);
		}

		for (int i : y) {

			System.out.println(i);
		}
	}
}
