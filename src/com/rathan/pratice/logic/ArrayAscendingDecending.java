package com.rathan.pratice.logic;

public class ArrayAscendingDecending {

	public static int[] descending(int x[]) {
		int max = x[0];
		
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
				if (x[i] < x[j]) {
					max = x[i];
					x[i] = x[j];
					x[j] = max;
				}
			}

		}

		return x;
	}

	public static int[] ascending (int y[]) {
		int min = 0;
		// int[] y1 = { 10, 50,  7, 80, 94, 14, 2, 80, 9, 20 };
		for (int i = 0; i < y.length; i++) {
			// after first iteration x={2,50,10,90,94,14,7,80,9,20]
			// after 2nd iteration x={2,7,50,90,94,14,10,80,9,20]
			// after 3rd and 4 iteration x={2,7,9,10,94,90,50,80,14,20]
			for (int j = i + 1; j < y.length; j++) {
				// first itr i
				// first itr j x= NO CHANGES
				// SECOND ITR X={7,50,10, 80, 94, 14, 2, 80, 9, 20}
				// 3rd , 4 th , 5th no changes
				// 6th x={2,50,10, 80, 94, 14, 7, 80, 9, 20}
				if (y[i] > y[j]) {
					min = y[j];
					y[j] = y[i];
					y[i] = min;

				}
			}

		}
		
		return y;
	}
	
	
	
	public static int arraySum(int z[]) {
		
	int	sum=0; 
	for(int i=0;i<z.length;i++) {
		
		sum=sum+z[i];
		
	}
		return sum;
		
	}
	

	public static int[] reverseArray(int k[]) {
		
			for (int i = k.length-1; i>=0; i--) {
				
			System.out.println(k[i]);
				}
		
		return k;
		
	}
		
	
	
	
	

	public static void main(String[] args) {

		ArrayAscendingDecending a = new ArrayAscendingDecending();
		int[] x = { 90, 98, 87, 65, 4, 3, 9, 67 };
		int c[] = ascending(x);
		for (int i = 0; i < c.length; i++) {
	//System.out.println("Ascending numbers" + c[i]);
		}
		int d[] = descending(x);
		for (int i = 0; i < d.length; i++) {
	//System.out.println("Descending numbers" + d[i]);
		}
		int e = arraySum(x);
		int[] y = { 90, 98, 87, 65, 4, 3, 9, 67 };
		
		int f[]= reverseArray(x);
		
		for(int i=x.length-1;i>=0;i--) {
			
			System.out.println("reverse oder" + x[i]);
				}
	}
		
	}


