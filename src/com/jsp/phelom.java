package com.jsp;

import java.util.Scanner;

public class phelom {
	public static int reverse(int no) {
		int rever=0;
		while (no!=0) {
			int rem=no%10;
			rever=rever*10+rem;
			no=no/10;	
		}
		return rever;

	}
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		   int no= x.nextInt();
		   int sum=0;
			int sum_mid=0;
			reverse(no);
				int rem=no%10;
				no=no/10;
				int re=reverse(no);
				int r=re%10;
				sum=sum+rem;
				sum=sum+r;
				
				//System.out.println(sum);
				re=re/10;
				while (re!=0) {
					int m=re%10;
					sum_mid=sum_mid+m;
					re=re/10;
				}
				if (sum==sum_mid) {
					System.out.println("the no is xylom");
				}
				else {
					System.out.println("phlom number");
				}
	}

}
