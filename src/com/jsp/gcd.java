package com.jsp;

public class gcd {
	public static void main(String[] args) {
		int a=18;
		int b=36;
		while (b!=0) {
			int temp=b;
			b=a%b;
			 a=temp;
			
		}
		System.out.println(a);
		
	}

}
