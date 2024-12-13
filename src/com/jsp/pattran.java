package com.jsp;

import java.util.Iterator;
import java.util.Scanner;

public class pattran {
	public static void sub(int no) {
		for(int row=1;row<=no;row++)
		{
			for(int col=1;col<=no;col++)
			{
				System.out.print( "* " );
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
	int no=	x.nextInt();
	sub(no);
	}

}
