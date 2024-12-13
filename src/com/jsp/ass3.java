package com.jsp;

import java.util.Scanner;

public class ass3 {
	public static void demo(int no) {
		char ch='Z';
		for (int row = 1; row <= no; row++) {
			for (int col = 1; col <= no; col++) {
				
				if (row+col==no+1|| col==row) {
					System.out.print(ch);
				}
				else {
					System.out.print('-');
				}
	          }
					
			System.out.println(" ");
			ch--;
		}
		
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}
}
