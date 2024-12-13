package com.jsp;

import java.util.Scanner;

public class pattran2 {
	public static void pat(int no) {
		for(int row=1;row<=no;row++)
		{
			for(int col=1;col<=no;col++)
			
			
			if (row<2) {
				System.out.print("- ");
			}
			else {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
		
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
		pat(no);
	}

}
