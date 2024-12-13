package com.jsp;

import java.util.Scanner;

public class ass4 {
	public static void demo(int no) {
		for (int row = 1; row<=(no*2)-1; row++) {
			char ch='A';
			int n=1;
			for (int col = 1; col<=no*2-1; col++){
				
				if ((row+col>=no+1) && (col-row<=no-1) &&  (row-col<=no-1) &&( row+col<=(no*3)-1)) 
				{
					 
					if (col%2==0 && row%2==0  ) {
						System.out.print(ch+" ");
						ch++;
					}
					else {
						System.out.print(n+" ");
						n++;
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
