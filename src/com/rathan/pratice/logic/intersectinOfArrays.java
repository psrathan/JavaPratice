package com.rathan.pratice.logic;

public class intersectinOfArrays {
	public static int[] intersectinOfArrays() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 9, 8, 7, 6, 5, 4 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j])
					System.out.println(a[i]);

			}
		}
		return b;

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 9, 8, 7, 6, 5, 4 };
		 
		int[] c= intersectinOfArrays();

	}

}