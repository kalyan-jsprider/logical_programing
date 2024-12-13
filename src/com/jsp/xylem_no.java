package com.jsp;

import java.util.Scanner;

public class xylem_no {
	public static int reverse(int no) {
		int rev=0;
		while (no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
		   no=no/10;
		}
		return rev;
	}
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the no:");
	        int no=x.nextInt();
	        int sum=0;
	        int mid_range=0;
	        reverse(no);
	        int rem1=no%10;
	        no=no/10;
	        int re=reverse(no);
	        int r=re%10;
	        sum=sum+rem1;
	        sum=sum+r;
	        re=re/10;
	        while (re!=0) {
				int m=re%10;
				mid_range=mid_range+m;
				re=re/10;
			}
	        if (sum==mid_range) {
				System.out.println("this is xylom no");
			}
	        else {
				System.out.println("this is phelom no");
			}

	        
}
}
