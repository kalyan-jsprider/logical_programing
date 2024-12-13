package com.jsp;

import java.util.Scanner;

public class pattarn7 {
	public static void demo(int no) {
		char ch='A';
		for (int row = 1; row <= no; row++) {
		
			for (int col = 1; col <= no; col++) {
				System.out.print(ch);
				
	}ch++;
		
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}

	}


