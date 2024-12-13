package com.jsp;

public class perfectnbo {
	public static void main(String[] args) {
		perfect(28);
	}

	private static void perfect(int no) {
		int sum=0;
		for (int i = 1; i <no ; i++) {
			if (no%i==0) {
				sum=sum+i;
				
			}
		
		}
		System.out.println(sum);
		if (sum==no) {
			System.out.println("this is a perfectno");
		}
		else {
			System.out.println("this is not a perfect no");
		}
	}

}
