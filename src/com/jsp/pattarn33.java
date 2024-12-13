package com.jsp;

import java.util.Scanner;

public class pattarn33 {
public static void demo(int no) {
	
	for (int row = 1; row<=no; row++) {
		for (int col = 1; col<=(no*2-1); col++){
			
			if (row<=col && col+row<=no*2 ) 
			{
				System.out.print('*');
			
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


