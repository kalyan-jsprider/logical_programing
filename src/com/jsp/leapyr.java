package com.jsp;

import java.util.Scanner;

public class leapyr {
	public static void cal(int year) {
		if ((year%4==0 && year%100!=0)|| (year%400==0)) {
			System.out.println("this is leapyear");
		}
		else {
			System.out.println("this is not leapyear");
		}
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
	int year=x.nextInt();
		cal(year);
	}

}
