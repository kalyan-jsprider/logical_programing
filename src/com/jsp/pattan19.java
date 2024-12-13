package com.jsp;

import java.util.Scanner;

public class pattan19 {
public static void demo(int no) {
	char ch='a';
		int a=1;
		for (int row = 1; row<=no; row++) {
			
			for (int col=1; col<=no; col++){
				
				if (row+col>=no+1 ) 
				{
					System.out.print(ch+" ");
					ch++;
				}
				
			
				else {
					System.out.print(a+" ");
					
					a++;
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
