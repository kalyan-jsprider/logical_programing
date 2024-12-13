package com.jsp;

import java.util.Scanner;

public class pattn22 {
	public static void demo(int no) {
		
			for (int row = 1; row<=no; row++) {
				char ch='a';
				int a=1;
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
