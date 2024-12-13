package com.jsp;

import java.util.Scanner;

public class pattn25 {
public static void demo(int no) {
		
		
		for (int row = 1; row<=no; row++) {
			int a=1;
			for (int col = 1; col<=(no*2-1); col++){
				
				if (row+col>=no+1 && col-row<=no-1 ) 
				{
					if (row==no) {
						System.out.print(col);
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
