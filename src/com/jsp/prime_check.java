package com.jsp;

import java.util.Scanner;

public class prime_check {
public static void prime(int no) {
	int count=0;
	for(int i=1;i<=no;i++)
	{
		if (no%i==0) {
			count++;
		}
		
	}
	if (count==2) {
		System.out.println("this is prime");
	}
	else {
		System.out.println("this is not a prime");
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
	prime(no);
}
}
