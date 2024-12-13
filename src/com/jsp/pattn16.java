package com.jsp;

import java.util.Scanner;

public class pattn16 {
	public static void demo(int no) {
		int a=1;
		int b=2;
		int c=3;
		for (int row = 1; row<=no; row++) {
			
			for (int col=1; col<=no; col++){
				if (col==1) {
					System.out.print(a);
					
				}
				else if (row==col) {
					System.out.print(c);
				}
				else if ( row==no) {
					System.out.print(b);
				} 
				else if (row>col) {
					System.out.print(a+b+c);
				}
				else {
					System.out.print("");
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
