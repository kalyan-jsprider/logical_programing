package com.jsp;

import java.util.Scanner;

public class pattn14 {
	
	
	public static void demo(int no) {
		
		
		for (int row = 1; row <= no; row++) {
			int x=1;
			char ch='R';
			for (int col = 1; col<=no*2-2; col++) {
				if (row+col==no+1) {
					System.out.print(x+" ");
					
				} 
				else if (row==no) {
					System.out.print(no+" " );
				}
				else if ( col-row==no-1) {
					System.out.print(x +"  ");
				
				}
				else if (row+col<no*2) {
					System.out.print(ch);
					ch--;
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
