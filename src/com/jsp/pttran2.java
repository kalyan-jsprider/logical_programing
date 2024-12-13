package com.jsp;



public class pttran2 {
	public static void demo(int no) {
		for (int row = 0; row <=no; row++) {
			for (int col =0; col <=no; col++) {
				if (row==no|| row+col>=no) {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();;
		}
		}
	
public static void main(String[] args) {
	demo(4);
}
}
