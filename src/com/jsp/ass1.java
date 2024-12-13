package com.jsp;

import java.util.Scanner;

public class ass1 {
public static void demo(int no) {
		
		for (int row = 1; row<=(no*2)-1; row++) {
			int A=10;
			for (int col = 1; col<=no*2-1; col++){
				
				if ((row+col>=no+1) && (col-row<=no-1) &&  (row-col<=no-1) &&( row+col<=(no*3)-1)) 
				{
					 
						System.out.print(--A+" ");
					
					
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
