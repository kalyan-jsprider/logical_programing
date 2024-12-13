package com.jsp;

import java.util.Scanner;

public class practice1 {
	public static void happy(int no) {
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		if (sum>=10) {
			happy(sum);
		}
		else if (sum==1) {
			System.out.println("this is happy no");
		}
		else {
			System.out.println("this is not a happy no");
		}
	}
	public static int product_sum(int no) {
		int pro=1;
		int sum=0;
		int ans=0;
		while (no!=0) {
			int rem=no%10;
			pro=rem*pro;
			no=no/10;
		}
		if (sum==pro) {
			pro=ans;
			
		}
		else {
			System.out.println("not reqiured");
		}
		return ans;
	}
	public static int sum(int no) {
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("sum of the no is"+" "+sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=x.nextInt();
		int product=product_sum(no);
	int multiply=product*no;
	int final_ans= product_sum(multiply);
		sum(no);
		happy(final_ans);
	}

}
