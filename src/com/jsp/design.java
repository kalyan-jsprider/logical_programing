package com.jsp;

import java.util.Scanner;

public class design {
	public static boolean isprime(int num) {
		int count=2;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
				count++;
			
		}
		return count==2;
		 
	}
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int num=x.nextInt();
	if(isprime(num))
		System.out.println("it is a prime no");
	else {
		System.out.println("it is not a prime");
	}  
}
}
