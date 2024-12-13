package com.jsp;

import java.util.Scanner;

public class prime_renge {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int lowerbound=x.nextInt();
		int upperbound=x.nextInt();
		if( lowerbound<upperbound||lowerbound<=2) {
			System.out.println("invalid age");
			return;
		}
		else {
			System.out.println("primeno between"+lowerbound+"and"+upperbound+"are:");
			
			for(int i=lowerbound;i<=upperbound;i++) {
			if(isPrime(i)){
				System.out.println(i+"");
			
			}
			}
		}
	}
	public static boolean isPrime(int no) {
		if(no<=1) {
			return false;
		}
	
	for(int i=2; i<Math.sqrt(no);i++) {
		if(no%i==0) {
			return false;
		}
	}
	return true;
}
}

