package com.jsp;

import java.util.Scanner;

public class sum_digit {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=x.nextInt();
		for (int i = 0; i < no; i++) {
			int sum=0;
			while (no!=0) {
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
				
			}
			System.out.println(sum);
		}
	}

}
