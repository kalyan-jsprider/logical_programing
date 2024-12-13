package com.jsp;

import java.util.Scanner;

public class practice_patt {
	public static void demo(int no) {
		for (int row = 1; row <=no; row++) {
			for (int col = 1; col <=no; col++) {
				if (row+col==no+1 || row==col) {
					if (row%2!=0) {
						System.out.print('x');
					}
					else {
						System.out.print(col/2);
					}
				}
				else {
					System.out.print('y');
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		      int no=  x.nextInt();
		      demo(no);
	}

}
