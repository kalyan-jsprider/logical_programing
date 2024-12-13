package com.jsp;

public class practice2 {
	public static void main(String[] args) {
		int n=10;
		String s="";
		while (n!=0) {
			int rem=n%2;
			s=rem+s;
			n/=2;
			
		}
		System.out.println(s);
	}

}
