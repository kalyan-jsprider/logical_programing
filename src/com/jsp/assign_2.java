package com.jsp;

import java.util.Scanner;

public class assign_2 {
	public static void demo(int no) {
		char ch='z';
		for (int row = 1; row <= no; row++) {
			
			for (int col = 1; col <= no; col++) {
					if ( row+col==no+1 || row==col) {
						if (col%2==1 ) {
							System.out.print(9);
						}
						else {
							System.out.print(8);
							
						}
					}
					else {
						System.out.print( ch+"");
					}
			}
				System.out.println();
				ch--;
			}
	}
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}

}
