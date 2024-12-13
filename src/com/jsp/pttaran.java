package com.jsp;

public class pttaran {
	public static void demo(int no) {
		for (int row = 1; row <=no; row++) {
			for (int col = 1; col <=no; col++) {
				if (col==1|| row+col<=no+1) {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	demo(5);
}
}
