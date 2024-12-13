package com.jsp;

import java.util.Scanner;

public class date_birth {
	public static void calculater (int year) {
		if((year%4==0 && year%100==0)||(year%400==0)) {
			System.out.println("this is leapyear");
		}
		else {
			System.out.println("this is not a leapyear");
		}
	}
	
	public static void main(String[] args) {
		int curr_year=2024;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you date year:");
		int date_year = sc.nextInt();
		calculater(date_year);
		int age_now = curr_year - date_year;
		
		if(age_now == 0) {
			System.out.println("Invalid");
		}
		else if(age_now > 0 && age_now<16) {
			System.out.println("Child");
		}
		else {
			System.out.println("Adult");
		}
	}
}
