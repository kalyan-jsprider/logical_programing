package com.jsp;

import java.util.Scanner;

public class happyno {
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
			System.out.println("this is not happy no");
		}
	}

public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter a number to check the number is happy or not:");
	int no=x.nextInt();
	happy(no);

}
}
