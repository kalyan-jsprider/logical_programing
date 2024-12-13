package com.jsp;

import java.util.Scanner;

public class pattrn6 {
	public static void demo(int no) {
		for (int row = 1; row <= no; row++) {
			for (int col = 0; col <= no; col++) {
					if ( row==1) {
						System.out.print("A ");
					}
					else if (row==2) {
						System.out.print("B ");
					}
					else if(row==3) {
						System.out.print("C ");
					}
					else if (row==4) {
						System.out.print("D ");
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
