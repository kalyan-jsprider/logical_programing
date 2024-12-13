package com.jsp;

public class prime {
	public static void demo(int no) {
		int count=0;
		for (int i = 1; i <=no; i++) {
			if (no%i==0) {
				count++;
			}
			
		}
		if (count==2) {
			System.out.println("this is a prime no");
		}
		else {
			System.out.println("this is not a prime no");
		}
	}
	public static void main(String[] args) {
		demo(5);
	}

}
