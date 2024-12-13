package com.jsp;

import java.util.Scanner;

public class pattrn10 {
	public static void demo(int no) {
		for (int row = 1; row<=no; row++) {
			
			for (int col=1; col<=no; col++){
				if (row>=col) {
					System.out.print('*');
				}
				else {
					System.out.print(" ");
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
