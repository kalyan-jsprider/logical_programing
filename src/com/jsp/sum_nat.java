package com.jsp;

public class sum_nat {
	public static void demo(int no) {
		int sum=0;
		for (int i = 1; i <=no; i++) {
			  sum=sum+i;
		}
		System.out.println(sum);
	}
public static void main(String[] args) {
	demo(6);
}

}
