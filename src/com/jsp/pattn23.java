package com.jsp;

import java.util.Scanner;

public class pattn23 {
	public static void demo(int no) {
		
		for (int row = 1; row<=no; row++) {
			int a=1;
			for (int col=1; col<=no; col++){
				
				if (row==1 ) 
				{
					System.out.print('a'+" ");
					
				}
				else if (row==no) {
					System.out.print('b'+" ");
				}
				else if (col==1) {
					System.out.print('c'+" ");
				}
				else if (col==no) {
					System.out.print('d'+"  ");
				}
				else if (row+col==no+1) {
					System.out.print(1+" ");
				}
				else if (row==col) {
					System.out.print(1+" ");
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
