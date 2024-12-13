package com.jsp;

import java.util.Scanner;

public class xylom {
public static int reverse(int x) {
	int rev=0;
	while (x!=0) {
		int rem=x%10;
		rev=(rev*10)+rem;
		x=x/10;
	}
	return rev;
}

public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter the no:");
	int no=x.nextInt();
	int lastdigit=no%10;
	no=no/10;
	int sum=0;
	int revset=reverse(no);
	int find_dig=revset%10;
	int e_digit_sum=find_dig+lastdigit;
	int mid_dig=revset%10;
	int mid_sum=0;
	while (mid_dig!=0) {
		int rem=mid_dig%10;
		 sum=rem+sum;
		 sum=revset+sum;
	mid_dig=mid_dig/10;
	if (e_digit_sum==mid_dig) {
		System.out.println("this is xylom no");
	}
	else {
		System.out.println("this is phelom no");
	}
		
	}
	
	
	
	
	
}
}

