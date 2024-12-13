package com.jsp;

import java.util.Scanner;

public class amstrong {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=sc.nextInt();
		sub(no);
		operater(no);
	}

	private static void operater(int no) {
		int copy=no;
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			int product=sub1(rem);
			sum=sum+(product);
			no=no/10;
		}
		if (copy==sum) {
			System.out.println("it is amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
		
	}

	private static int sub1(int rem) {
		int product=1;
		for(int i=1;i<=count;i++) {
			product=product*rem;
		}
		return product;
	}

	private static void sub(int no) {
		while (no!=0) {
			count++;
			no=no/10;
		}
	}
	}


