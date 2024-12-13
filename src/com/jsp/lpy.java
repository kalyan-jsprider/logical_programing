package com.jsp;

public class lpy {
	public static void oparate(int year) {
		if ((year%4==0 || year%100==0)||(year%400==0)) 
			{
				System.out.println("this is leapyear");
			}
		else {
				System.out.println("this is not a leapyear");
			}
		}
	public static void main(String[] args) {
		oparate(2023);
	}

}
