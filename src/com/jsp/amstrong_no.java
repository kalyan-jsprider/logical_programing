package com.jsp;

import java.util.Scanner;

public class amstrong_no {
	static int count=0;
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
			oparate(no);
		sub(no);
	}
	public static void oparate(int no) {
		int copy=no;
		int sum=0;
			while (no!=0) {
			int rem=no%10;
				int product=sub1(rem);
				sum=sum+(product);
				no=no/10;
			}
			if (sum==copy) {
				System.out.println("this is amstrong no");
			}
			else {
				System.out.println("this is not amstrong no");
			}
		}
	public static int sub1(int rem) {
		int product=1;
		for(int i=1;i<=count;i++) {
			product=product*rem;
		}
		return product;
	}
	
	public static void sub(int no) {
		while (no!=0) {
			count++;
			no=no/10;
		}
		
		
	}
	

}
