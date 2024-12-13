package com.jsp;

import java.util.Scanner;

public class pattan30 {
	public static void printPattern(int row) {
		for (int i = 0; i < row; i++) {
			
			// Printing the space part
			for (int space = row - i - 1; space > 0; space--) {
				System.out.print(" ");
			}
			
			// Printing the character part
			for(int num = 1; num <= 2*i + 1; num++) {
				System.out.print(num);
			}
		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		printPattern(row);
		sc.close();
	}

}
