package com.jsp;


public class amstrong_number {
	
public static void main(String[] args) {
	Sub(153);
}

private static void Sub(int no) {
	int sum=0;
	int copy=no;
	while (no!=0) {
		int rem =no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
	if (copy==sum) {
		System.out.println("this is amstrong num");
	}
	else {
		System.out.println("this is not a amstrong no");
	}
}
}
