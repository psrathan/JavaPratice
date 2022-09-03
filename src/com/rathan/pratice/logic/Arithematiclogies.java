package com.rathan.pratice.logic;

public class Arithematiclogies {

	static public int sum() {

		int x = 10;
		int y = 20;
		int sum = x + y;
		return (sum);
	}

	static public int sum(int i, int j, int k) {

		int sum = i + j + k;
		return (sum);
	}

	static public int sum(int i, int j, int k, int l) {

		int sum = i + j + k + l;
		return (sum);
	}

	static public int sub() {
		int x = 50;
		int y = 25;
		int sub = x - y;
		System.out.println("The sub of x,y" + sub);
		return (sub);
	}

	public static float div() {
		int x = 101;
		int y = 3;
		int div = x / y;
		System.out.println("The div of x,y " + div);
		return div;
	}

	static public int mul(int c, int d) {
		int mul = c * d;
		System.out.println("The mul  " + mul);
		return mul;
	}

	static public double mul(int c, int d, float e) {
		int mul = c * d;
		float mul1 = mul * e;
		System.out.println("The mul  " + mul);
		return mul1;
	}

	static {
		int c = 10 + 20;
		System.out.println(c);
	}
	{
		System.out.println(30 + 40);
	}

	public void old() {
		int i = 1;
		for (i = 1; i < 10; i++) {
			if (i % 2 == 1)
				System.out.println("The old numger is" + i);
		}
	}

	public void even() {
		int i = 1;
		for (i = 1; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println("The even numger is " + i);
		}
	}

	static public long sum(int... a) {
		long sum = 0;
		for (int i=0; i<a.length;i++) {
					sum+=a[i];
		}	
		System.out.println("sum usng using var arg values"+ sum);

		return sum;
		
	}
	public static void main(String[] args) {

		Arithematiclogies b = new Arithematiclogies();

		b.old();
		b.even();
		int c = sum();
		int d = sub();
		float e = div();
		double a = mul(c, d, e);

		System.out.println("mul" + a);
		System.out.println("sum" + c);
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40));
		System.out.println(sum(10,20,30,40,50,60,70,80,90));
		System.out.println(mul(c, d));

	}

}
