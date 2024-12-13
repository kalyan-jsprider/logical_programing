package com.jsp;

import java.util.Scanner;

public class pattarn4 {
	public static void demo(int no) {
for(int row=1;row<=no;row++) {
			
			for(int col=1;col<=no;col++)
			{
				if (row%2==1 )
				{
					System.out.print("A ");
				}
				else {
					System.out.print("Z ");
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
