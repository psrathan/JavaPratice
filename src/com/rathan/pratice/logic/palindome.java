package com.rathan.pratice.logic;

public class palindome {
	static String s = "level";
	static String rs = "";
	static char[] ch = s.toCharArray();
	static int i=0;

	public static void main(String[] args) {		
		
		for (int i= 0; i<ch.length; i++) {
			rs = rs+ch[(ch.length -1)- i];// ch[(5-1)-0]   => ch[4-0]=>   ch[4]

		} 
		if (s.equals(rs)) {

			System.out.println("its palindrome");
		} 
		else {
			System.out.println("its not palindrome");

		}
	}

}
