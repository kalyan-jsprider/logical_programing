package com.jsp;

public class sum {
	public static void sum(int no) {
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;                                      
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sum(145);
	}

}
      