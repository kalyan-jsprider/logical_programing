package com.jsp;

public class zigzag {
	public static int reverse(int no) {
		int rev=0;
		while (no!=0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		return (rev);
		
	}
	public static void main(String[] args) {
		int no1=1357;
		int no2=8642;
		int reverset=reverse(no1);
		while (reverset !=0) {
			int rem1=reverset%10;
			int rem2=no2%10;
			System.out.print(rem1+""+rem2);
			reverset=reverset/10;
			no2=no2/10;
			
			
		}
	
	}
	
}
