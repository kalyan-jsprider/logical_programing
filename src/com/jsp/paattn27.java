package com.jsp;

import java.util.Scanner;

public class paattn27 {
	
	public static void demo(int no) {
		char ch='A';
	
		for (int row = 1; row <= no; row++) {
			
			
			for (int col = 1; col<=(no*2); col++) {
				if (row+col>=no+1 && col-row<=no-1 ) {
					if (row+col<=no+1) {
						System.out.print(col);
						
					}
					
					
				}
			
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}

}
