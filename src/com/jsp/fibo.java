package com.jsp;

public class fibo {
	public static void fibon(int no) {
		int fib1=0;
		
		int fib2=1;
		for (int i = 1; i <no; i++) {
			int fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}
	public static void main(String[] args) {
		fibon(10);
	}

}
