package com.jsp;

import java.util.Scanner;

public class amstrong {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=x.nextInt();
		amstrongno(no);
	}

	private static void amstrongno(int no) {
		int sum=0;
		int copy=no;
		while (no!=0) {
		int rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
		
		
		}
		if (copy==sum) {
			System.out.println("this is a amstrong no");
		}
		else {
			System.out.println("this is not a amstrong no");
		}
		
	}

}
