package com.jsp;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=x.nextInt();
		int rev=0;
		int copy=no;
		while (no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if (rev==copy) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("this is not a palindrome");
		}
	}

}
