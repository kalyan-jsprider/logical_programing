package com.jsp;

public class zigzag1 {
	public static void main(String[] args) {
		int no1=2468;
		int no=9753;
		int reverse=rev(no1);
		while (reverse!=0) {
		int rem1=	reverse%10;
		int rem2=no%10;
		System.out.print(rem1+""+rem2);
		reverse=reverse/10;
		no=no/10;
		}
	}

	private static int rev(int no1) {
		int rev=0;
		while (no1!=0) {
			int rem=no1%10;
		 rev=(rev*10)+rem;
		 no1=no1/10;
		}
		return rev;
	}

}
