package com.jsp;

import java.util.Scanner;

public class reverse_no {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int reverse=0;
		int temp=0;
		while(num!=0) {
			int d=num%10;
		 reverse=reverse*10+d;
			num=num/10;
		}
		
		System.out.println(reverse);
		//check for palindrome
if(temp==reverse)
	System.out.println("it is palindrome");
else
	System.out.println("it is not palendrome");
	}
	

}
