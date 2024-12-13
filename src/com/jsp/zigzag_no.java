package com.jsp;

public class zigzag_no {
	public static int zigzag(int no) {
		int rev=0;
		while (no!=0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int no1=5432;
		int no2=3216;
		String ans="";
		int reverse=zigzag(no1);
		while (reverse !=0) {
			int rem1=reverse%10;
			int rem2=no2%10;
			ans=ans+(rem1+""+rem2);
			reverse=reverse/10;
			no2=no2/10;
		}
		Double x=Double.parseDouble(ans);
		System.out.println("the output is");
		System.out.println(x+1);
	}
}
