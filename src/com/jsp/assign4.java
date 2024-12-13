package com.jsp;

import java.util.Scanner;

public class assign4 {
	public static void demo(int no) {
		for(int i=0;i<=no;i++)
			System.out.println((int)Math.pow(11, i));
	}
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int no=x.nextInt();
	demo(no);
	}
}
