package com.jsp;

import java.util.Scanner;

public class pattarn35 {
	public static void demo(int no) {
		char ch='A';
		for (int row = 1; row<=no; row++) {
			int a=1;
			for (int col = 1; col<=no*2-1; col++){
				
				if (row<=col && col+row<=no*2 ) 
				{
					if (col<=no) {
						System.out.print(col+" ");
					
					}
					else {
						System.out.print(ch+++" ");
					}
				
				}
				
				
				else {
					System.out.print("  ");
					
					
				}
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
