package com.rathan.pratice.logic;

public class Arraylogies {

	public void numArray() {
		int[] x = { 10, 50, 7, 80, 94, 14, 2, 80, 9, 20 };
		for (int i = 0; i < x.length; i++) {

			// System.out.println("Array Numbers is:" + x[i]);
		}

	}

	public int max(int a[]) {

		int max = 0;
		// int[] x = { 10, 50, 7, 80, 94, 14, 2, 80, 9, 20 };
		// x[0] < x[1], x[0]<x[2]

		for (int i = 0; i < a.length; i++) {

			if (max > a[i]) {

				max = max;
			} else {

				max = a[i];
			}

		}
		return max;
	}

	public int min(int b[]) {

		// int[] x = { 10, 50, 7, 80, 94, 14, 2, 80, 9, 20 };
		// x[0] < x[1], x[0]<x[2]
		int min = b[0];

		for (int i = 0; i < b.length; i++) {

			if (min < b[i]) {

				min = min;
			} else {

				min = b[i];
			}

		}
		return min;
	}

	public int[] ascending(int x[]) {
		int max = 0;
		// int[] x = { 10, 50, 7, 80, 94, 14, 2, 80, 9, 20 };

		for (int i = 0; i < x.length; i++) {
			// after first iteration x={2,50,10,90,94,14,7,80,9,20]
			// after 2nd iteration x={2,7,50,90,94,14,10,80,9,20]
			// after 3rd and 4 iteration x={2,7,9,10,94,90,50,80,14,20]
			for (int j = i + 1; j < x.length; j++) {
				// first itr i
				// first itr j x= NO CHANGES
				// SECOND ITR X={7,50,10, 80, 94, 14, 2, 80, 9, 20}
				// 3rd , 4 th , 5th no changes
				// 6th x={2,50,10, 80, 94, 14, 7, 80, 9, 20}
				if (x[i] > x[j]) {
					max = x[i];
					x[i] = x[j];
					x[j] = max;
				}
			}
		}

		return x;
	}

	public static void main(String[] args) {

		Arraylogies a = new Arraylogies();
		int b[] = { 20, 60, 40, 90, 7, 23, 7 };
		a.max(b);
		a.min(b);
		int x[] = a.ascending(b);
		for (int i = 0; i < x.length; i++) {
			System.out.println("acsending oder is" + x[i]);
		}
		a.numArray();
		System.out.println("maximum value is" + a.max(b));
		System.out.println("minimum value is" + a.min(b));
	}

}
