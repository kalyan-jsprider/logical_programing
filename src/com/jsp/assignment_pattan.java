package com.jsp;

import java.util.Scanner;

public class assignment_pattan {
	public static void demo(int no) {
		
		for (int row = 1; row <= no; row++) {
			char ch='p';
			for (int col = 1; col <= no; col++) {
					if ( row+col==no+1 || row==col ) {
						System.out.print(ch);
					}
						
						else {
							System.out.print((row+col)/2);
							
						}
						ch++;
					
					}
			System.out.println();
			}
				
			}

		public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}

}
